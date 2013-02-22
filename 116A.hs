-- 116A
tram :: [[Int]] -> Int
tram xs = maximum (scanl (+) 0 (map weirdSum xs))
    where weirdSum xs = last xs - head xs 

readIn :: IO [[Int]]
readIn = do
    contents <- getContents
    let n:ls = lines contents
        x = read $ head $ words n 
        xs = take x $ map ((map read) . words) ls
    return xs

main :: IO()
main = do
    i <- readIn
    putStrLn $ show (tram i)
