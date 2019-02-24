package artistry.enums;

public enum EpicType {
	
	// an initiative that is constrained to a single program.
	PROGRAM_EPIC_SPIKE_FIRST,
	PROGRAM_EPIC_SOME_FEATURES_FIRST,
	PROGRAM_EPIC_ARCHITECTURAL_EPIC_FIRST,
	PROGRAM_EPIC_ARCHITECTURAL_EFFORT_PRECEDES_BUSINESS_FUNCTIONALITY_BY_ONE_PI,
	PROGRAM_EPIC_ARCHITECTURAL_EFFORT_PRECEDES_BUSINESS_FUNCTIONALITY_BY_ONE_OR_A_FEW_ITERATIONS,
	
	
	// involves more than one program
	PORTFOLIO_EPIC_SPLIT_INTO_PROGRAM_EPICS_AND_DECENTRALIZE,
	PORTFOLIO_EPIC_TAKE_A_VERTICAL_SLICE_OF_AN_EPIC_ACROSS_ALL_TRAINS_AND_REVISE_AFTER_PI,
	PORTFOLIO_EPIC_ONE_PROGRAM_IMPLEMENTS_SOME_FEATURES_OTHERS_WAIT,
	PORTFOLIO_EPIC_CONCURRENT_IMPLEMENTATION_WITH_ARCHITECTURAL_EPIC

}
