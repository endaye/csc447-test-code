var n = 14

val half = 
	if (n % 2 == 0)
		n / 2
	else 
		throw new RuntimeException("n musht be even")