package models

import "time"

type Invoice struct {
	Orders   []Order
	Customer string
	DueDate  time.Time
}
