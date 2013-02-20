-- 71A

longWords :: [String] -> [String]
longWords strs = [  if length s > 10 
                    then [head s] ++ show (length s - 2) ++ [last s]
                    else s | s <- strs]

readIn :: IO [[Char]]
readIn = do
    contents <- getContents
    let n:ls = lines contents
        x = read $ head $ words n  
        xs = take x $ map (head . words) ls
    return xs

main :: IO()
main = do
    i <- readIn
    putStr (unlines $ longWords i)
