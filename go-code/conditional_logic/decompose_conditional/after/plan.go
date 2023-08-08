package before

import "time"

type Plan struct {
	SummerStart          time.Time
	SummerEnd            time.Time
	SummerRate           float64
	RegularRate          float64
	RegularServiceCharge float64
}
