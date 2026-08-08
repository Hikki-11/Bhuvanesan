function showCourses(){
    fetch("http://localhost:8080/courses")
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("course")

        courses.forEach(course => {
            var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.durationInWeeks}</td>
            <td>${course.trainer}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}

function showEnrolledStudents(){
    fetch("http://localhost:8080/courses/enrolled")
    .then((response) => response.json()) 
    .then((students) => {
        const dataTable = document.getElementById("enrolled")

        students.forEach(student => {
            var row = `<tr>
            <td>${student.course_name}</td>
            <td>${student.name}</td>
            <td>${student.email_id}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}