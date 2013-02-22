--82A

doubleCola :: (Num a) => a -> String
doubleCola = undefined

findMax :: (Num a, Ord a) => a -> [a]
findMax n =  
    where list = sumUpTo [5*2^x | x <- [0..]] n
    
sumUpTo :: [Int] -> Int -> [Int]
sumUpTo [] _ = []
sumUpTo (x:xs) max
    | max < x = []
    | max >= x = (x : getUpTo xs (max - x))

get :: IO Integer
get = fmap (head . (map read) . words) getLine

main = do
    num <- get
    putStrLn $ doubleCola num

