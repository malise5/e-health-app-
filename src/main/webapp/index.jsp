<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }

            .login-container {
                text-align: center;
                background-color: #f3f3f3;
                border: 1px solid #ccc;
                padding: 20px;
                border-radius: 10px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
                width: 50%;
                max-width: 400px;
            }

            input[type="text"],
            input[type="password"] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

            button {
                background-color: #04aa6d;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            button:hover {
                opacity: 0.8;
            }

            .cancelbtn {
                width: auto;
                padding: 10px 18px;
                background-color: #f44336;
            }

            span.psw {
                float: right;
                padding-top: 16px;
            }

            /* Change styles for span and cancel button on extra small screens */
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
                .cancelbtn {
                    width: 100%;
                }
            }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>E-Health Software</h2>

            <form action="/action_page.php" method="post">
                <div class="container">
                    <label for="uname"><b>Username</b></label>
                    <input
                        type="text"
                        placeholder="Enter Username"
                        name="uname"
                        required
                    />

                    <label for="psw"><b>Password</b></label>
                    <input
                        type="password"
                        placeholder="Enter Password"
                        name="psw"
                        required
                    />

                    <button type="submit">Login</button>
                </div>

                <div class="container">
                    <span class="psw">Forgot <a href="#">password?</a></span>
                </div>
            </form>
        </div>
    </body>
</html>
