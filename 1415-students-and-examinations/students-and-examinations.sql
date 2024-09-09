# Write your MySQL query statement below
SELECT st.student_id , st.student_name , su.subject_name , count(e.subject_name) AS attended_exams
FROM Students AS st
JOIN Subjects AS su
LEFT JOIN Examinations AS e
ON st.student_id = e.student_id AND su.subject_name = e.subject_name
GROUP BY student_id , subject_name
ORDER BY student_id ASC;