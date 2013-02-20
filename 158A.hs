-- 158A.hs

nextRound :: (Int, [Int]) -> Int
nextRound (low, list) = length [l | l <- list, l >= list !! (low - 1), l > 0]

readIn :: IO(Int, [Int])
readIn = do
    contents <- getContents
    let n:ns:_ = lines contents
        xs = map read $ take (read $ words n !! 0) $ words ns
        s = read $ words n !! 1
    return(s, xs)

main :: IO()
main = do
    i <- readIn
    putStrLn $ show $ nextRound i
