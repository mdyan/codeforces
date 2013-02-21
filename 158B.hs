import Data.Sequence

-- 158B
taxi :: [Int] -> Int
taxi [a] = 1
taxi [] = 0
taxi ns@(x:xs)
    | last xs <= (4-x) = taxi $ rotateAdd ns
    | otherwise =  1 + taxi xs                
    where rotateAdd (x:xs) = (x + last xs):(init xs)

readIn :: IO [Int]
readIn = do
    contents <- getContents
    let n:is = lines contents
        x = read $ head $ words n  
        xs = take x (map read (words $ head is))
    return xs

main :: IO()
main = do
    i <- readIn
    putStr $ show $ taxi $ reverse $ sort i
