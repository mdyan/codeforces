-- 1A
fun :: Int -> Int -> Int -> Integer
fun n m a = (mult n a) * (mult m a)
    where mult n a = ceiling $ (toRational n) / (toRational a)
    
main = do
    s <- getLine
    let ss = words s
    let n = read (ss !! 0) :: Int
    let m = read (ss !! 1) :: Int
    let a = read (ss !! 2) :: Int
    putStrLn $ show $ fun n m a
