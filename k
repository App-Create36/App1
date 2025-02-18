{
    "sessionId": 1,
    "sessionName": "Java Basics Training",
    "sessionDate": "2025-03-20",
    "sessionTime": "10:00:00",
    "clientId": "CID-0003",
    "mentorName": "John Doe",
    "status": "SCHEDULED",
    "progressPercentage": 0,
    "participants": [
        {
            "sessionId": 1,
            "clientId": "CID-0002",
            "attendanceStatus": "PENDING"
        }
    ],
    "feedback": [],
    "error": null
}

























1.>--- Create KT Session with Participants
Request Type: POST URL: http://localhost:9083/api/kt-sessions Headers:

Request Body:

json
{
    "sessionName": "Java Basics Training",
    "sessionDate": "2025-03-20",
    "sessionTime": "10:00:00",
    "mentorName": "John Doe",
    "organizerId": "CID-0004",
    "participantIds": ["CID-0005", "CID-0006"]
}

2.>---- Get KT Session by ID
Request Type: GET URL: http://localhost:9083/api/kt-sessions/{sessionId}

Steps:

Open Postman and select "GET".

Enter the URL: http://localhost:9083/api/kt-sessions/1 (replace 1 with the actual session ID).

3.--> Get KT Sessions by Client ID
Request Type: GET URL: http://localhost:9083/api/kt-sessions/client/{organizer_id}


4.--> Get All Clients by Session ID
Request Type: GET URL: http://localhost:9083/api/kt-sessions/session/clients/{sessionId}


5. Mark Attendance
Request Type: PUT URL: http://localhost:9083/api/kt-sessions/attendance/{sessionId}/{clientId}?status=PRESENT


Open Postman and select "PUT".

Enter the URL: http://localhost:9083/api/kt-sessions/attendance/1/CID-0005?status=PRESENT (replace 1 with the actual session ID and CID-0005 with the actual client ID).

6. Submit Feedback
Request Type: POST URL: http://localhost:9083/api/kt-sessions/feedback/{sessionId}/{clientId}

Request Body:

json
{
    "clientId": "CID-0005",
    "feedback": "Great session!",
    "feedbackDate": "2025-03-20T11:00:00"
}

http://localhost:9083/api/kt-sessions-get all sessions'
