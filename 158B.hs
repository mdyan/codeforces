-- 158B
taxi :: [Int] -> Int
taxi ns = 

readIn :: IO [Int]
readIn = do
    contents <- getContents
    let n:is = lines contents
        x = read $ head $ words n  
        xs = take x $ map read is
    return xs

main :: IO()
main = do
    i <- readIn
    putStr (unlines $ taxi i)
