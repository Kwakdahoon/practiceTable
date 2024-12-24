$(document).ready(function () {
    // 전송 버튼 클릭 이벤트
    $("#submitBtn").on("click", function () {
        const title = $("#title").val(); // 제목 값 가져오기
        const writer = $("#writer").val(); // 작성자 값 가져오기
        const content = $("#content").val(); // 내용 값 가져오기

        console.log("제목:", title);
        console.log("작성자:", writer);
        console.log("내용:", content);

        // 입력값 확인
        if (!title || !writer || !content) {
            alert("모든 필드를 입력해주세요!");
            return;
        }

        // AJAX 요청 (예시)
        $.ajax({
            type: "POST",
            url: "/board/write",
            contentType: "application/json",
            data: JSON.stringify({
                title: title,
                writer: writer,
                content: content,
            }),
            success: function (response) {
                alert("성공성공")
                console.log("서버 응답:", response);
                window.location.href="/board/list";
            },
            error: function (error) {
                alert("다메다메")
                console.log("오류:", error);
            },
        });
    });
});
