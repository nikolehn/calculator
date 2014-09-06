$(document).ready(function() {
    $('button.num').click(function() {
        $('pre#input').append($(this).text());
    });
});