function fibonnaciSequence(n){
    if(n < 0){
        throw new Error("Fibonnaci sequence is not defined for negative numbers")
    }
    else{
        if(n === 0 || n === 1){
            return n
        }
        else{
            return fibonnaciSequence(n - 1) + fibonnaciSequence(n - 2)
        }
    }
}


console.log(fibonnaciSequence(7))