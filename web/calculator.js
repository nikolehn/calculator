$(document).ready(function() {

    // State
    var dot_used = false;

    // Helpers
    function clear() {
        $('#input').text('');
        dot_used = false;
    }

    // Numbers
    $('button.num').click(function() {
        $('#input').append($(this).text());
    });

    // Dot
    $('button.dot').click(function() {
        if (!dot_used) {
            $('#input').append('.');
            dot_used = true;
        }
    });

    // Clean
    $('button.clear').click(clear);

    // Equal
    $('button.eq').click(function() {
        $('#history').append(
            '\n' + $('#input').text()
        );
        clear();
    });
});