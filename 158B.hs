import Data.List (sort)
-- 158B
-- this code kind of sucks

taxi :: [Int] -> Int
taxi ns = solve $ collect ns

solve :: (Int,Int,Int,Int) -> Int
solve (a,b,c,d) 
	| d > 0 = 	d + solve(a,b,c,0)
	| c > 0 = 	if (a >= 1)
				then 1 + solve (a-1,b,c-1,d)
				else 1 + solve (a,b,c-1,d)
	| b > 0 = 	if (b >= 2)
				then 1 + solve (a,b-2,c,d)
				else 
					case a of
						1 -> 1 + solve (a-1,b-1,c,d)
						0 -> 1 + solve (a,b-1,c,d)
						a -> 1 + solve (a-2,b-1,c,d)			
	| a > 0	= ceiling ( (fromIntegral a) / 4 )
	| otherwise = 0
	
collect :: [Int] -> (Int,Int,Int,Int)
collect ns = foldl accumulate (0,0,0,0) ns

accumulate :: (Int,Int,Int,Int) -> Int -> (Int,Int,Int,Int)
accumulate (a,b,c,d) n
		| n == 1 = (a+1,b,c,d)
		| n == 2 = (a,b+1,c,d)
		| n == 3 = (a,b,c+1,d)
		| n == 4 = (a,b,c,d+1)

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
    putStr $ show $ taxi i
