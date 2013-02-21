--82A

--118A
doubleCola :: (Num a) => a -> String
doubleCola = undefined

findMax :: (Num a, Ord a) => a -> a
findMax n = sum [a | a <- l, a <= n]
    where l = [5*2^x | x <- [0..]]

get :: IO Integer
get = fmap (head . (map read) . words) getLine

main = do
    num <- get
    putStrLn $ doubleCola num

