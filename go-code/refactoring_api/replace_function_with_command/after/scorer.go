package before

import "fmt"

// STEP 1: Create an empty struct
type Scorer struct {
	//STEP 3: I want to reduce number of arguments in the execute function. I prefer even not to have parameter for
	//that function. So I define them as variable in the struct

	candidate           Candidate
	medicalExam         MedicalExam
	scoringGuide        ScoringGuide
	result              int
	healthLevel         int
	highMedicalRiskFlag bool
}

func NewScorer(candidate Candidate, medicalExam MedicalExam, scoringGuide ScoringGuide) Scorer {
	return Scorer{
		candidate:    candidate,
		medicalExam:  medicalExam,
		scoringGuide: scoringGuide,
	}
}

// STEP 2: Move score func into a receiver function but rename it as Scorer is a command struct
// STEP 4 : Remove parameters from execute func
func (s Scorer) execute() int {
	//STEP 6: define variables used by both methods as struct variable
	/*
		healthLevel := 0
		highMedicalRiskFlag := false
	*/

	var result int

	s.scoreSmoking()

	certificationGrade := "regular"
	if s.scoringGuide.stateWithLowCertification(s.candidate.OriginState) {
		certificationGrade = "low"
		s.result = 5
	}

	fmt.Printf("highMedicalRiskFlag is %v", s.highMedicalRiskFlag)
	fmt.Printf("certificationGrade is %v", certificationGrade)

	result = s.max(s.healthLevel-5, 0)
	return result
}

// STEP 5: Exctract function from the execute function
func (s Scorer) scoreSmoking() {
	if s.medicalExam.IsSmoker {
		s.healthLevel += 10
		s.highMedicalRiskFlag = true
	}
}

func (s Scorer) max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
