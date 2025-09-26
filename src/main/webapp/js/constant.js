/**
 * 
 */
var HOST = "http://localhost:2016/Realtime/services/";
/**
 * Providing constants by grouping.
 * 
 */
var Constants = (function() {
    var URLConstants = (function() {
	function URLConstants() {
//		customer constants
		this.SAVE_STUDENT_DETAILS = HOST+'registration';
		this.GET_ALL_COURSES=HOST+'courses';
		this.GET_ALL_STUDENTS=HOST+'students';
		this.GET_STUDENTS_FEE_DETAILS=HOST+'student/fee/',
		this.GET_STUDENT_COURSE=HOST+'student/courses/'

	}
	return URLConstants;
    })();
    
    var constants = {
    		URLS : new URLConstants()
        };
        return constants;
    })();