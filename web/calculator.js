$(document).ready(function() {

    // State
    var dot_used = false;

    // Helpers
    function clear() {
        $('#input').text('');
        dot_used = false;
    }

    function flash_input() {
        $('#input').css('border-color', 'crimson');
        setInterval(function() {
            $('#input').css('border-color', 'white');
        }, 2000);
    }

    function add_history(line) {
        $('#history').append(
            line + '<br/>'
        );
    }

    // Numbers
    $('button.num').click(function() {
        $('#input').append($(this).text());
    });

    // One operand operations
    $('button.op1').click(function() {

        var operation = $(this).attr('id');
        var operand = $('#input').text();

        // Check the operand exists
        if (!operand) {
            flash_input();
            return;
        }

        // Perfom call to server
        $.ajax({
            type: 'GET',
            dataType: 'json',
            url: '/calculator/api/calc/' +
                operation + '/' +
                operand,
            success: function(data) {
                add_history(operation + '(' + operand + ')');
                dot_used = false;
                $('#input').text(data.result);
            },
            error: function(xhr, opts, err) {
                console.log(xhr.status);
                console.log(err);
                console.log(xhr.responseText);
                console.log(xhr);
                alert('Invalid entry!');
                clear();
            }
        });
    });

    // Dot
    $('#dot').click(function() {
        if (!dot_used) {
            $('#input').append('.');
            dot_used = true;
        }
    });

    // Clear
    $('#clear').click(clear);

    // Equal
    $('#eq').click(function() {
        add_history($('#input').text());
        clear();
    });
});