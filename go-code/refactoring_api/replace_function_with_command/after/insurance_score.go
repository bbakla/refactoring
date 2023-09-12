package after

import (
	"fmt"
)

type MedicalExam struct {
	IsSmoker bool
}

type ScoringGuide struct {
}

func (s ScoringGuide) stateWithLowCertification(state string) bool {
	return false
}

type Candidate struct {
	OriginState string
}

func score(candidate Candidate, medicalExam MedicalExam, scoringGuide ScoringGuide) int {
	var result int
	healthLevel := 0
	highMedicalRiskFlag := false

	if medicalExam.IsSmoker {
		healthLevel += 10
		highMedicalRiskFlag = true
	}

	certificationGrade := "regular"
	if scoringGuide.stateWithLowCertification(candidate.OriginState) {
		certificationGrade = "low"
		result = 5
	}

	fmt.Printf("highMedicalRiskFlag is %v", highMedicalRiskFlag)
	fmt.Printf("certificationGrade is %v", certificationGrade)

	result = max(healthLevel-5, 0)
	return result
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func main() {
	// Create instances of MedicalExam, ScoringGuide, and Candidate
	medicalExam := MedicalExam{IsSmoker: true}
	scoringGuide := ScoringGuide{}
	candidate := Candidate{OriginState: "NY"}

	// Call the score function
	result := score(candidate, medicalExam, scoringGuide)
	println("Result:", result)
}
