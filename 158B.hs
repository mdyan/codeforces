import Data.List (sort)

-- 158B
taxi :: [Int] -> Int
taxi [n] = 1
taxi (n:ns) 
	| n + last ns > 4 = 1 + taxi ns
	| 
	| n == 4 = 1 + taxi ns
	| n == 3 = if 
	where ns
	

readIn :: IO [Int]
readIn = do
    contents <- getContents
    let n:is = lines contents
        x = read $ head $ words n  
        xs = take x $ map read is
    return sort xs

main :: IO()
main = do
    i <- readIn
    putStr $ show $ taxi i
