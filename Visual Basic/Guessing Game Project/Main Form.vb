' Program: Guessing Game - Hot, Cold, Money!
' Purpose: A random number guessing game, numbers between 1 and 25
' picture credit: openclipart.org
' Programmer: Gary A. Newsome
' ex5.C.5
' CPT 162 Visual Basic
' Westmoreland County Community College

Public Class frmMain
    ' declaration - global
    Dim intMyNum As Integer

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub btnGuess_Click(sender As Object, e As EventArgs) Handles btnGuess.Click
        ' declarations
        Dim intGuess As Integer
        Dim blnIsGuessOk As Boolean

        ' store data in variables
        blnIsGuessOk = Integer.TryParse(txtGuess.Text, intGuess)

        ' validate data
        If blnIsGuessOk AndAlso (intGuess > 0 AndAlso intGuess < 26) Then
            ' calculate guess
            Select Case intGuess
                Case Is < intMyNum
                    lblMsg.ForeColor = Color.Blue
                    lblMsg.Text = "Brrr!! Chilly chilly, TOO COLD guess higher."
                    picTemp.Image = picCold.Image
                Case Is > intMyNum
                    lblMsg.ForeColor = Color.Red
                    lblMsg.Text = "En fuego!!! TOO HOT, please guess lower."
                    picTemp.Image = picHot.Image
                Case Else
                    lblMsg.ForeColor = Color.Green
                    lblMsg.Text = "On the money! You are correct."
                    picTemp.Image = picMoney.Image
            End Select
        Else
            lblMsg.Text = "Invalid guess, please try again."
        End If

        ' return focus and select contents
        txtGuess.Focus()
        txtGuess.SelectAll()

    End Sub

    Private Function money() As Object
        Throw New NotImplementedException
    End Function

    Private Function hot() As Object
        Throw New NotImplementedException
    End Function

    Private Function cold() As Object
        Throw New NotImplementedException
    End Function

    
    Private Sub btnStart_Click(sender As Object, e As EventArgs) Handles btnStart.Click
        ' declarations
        Dim randomGen As New Random

        ' create random number
        intMyNum = randomGen.Next(1, 26)
    End Sub

    Private Sub txtGuess_TextChanged(sender As Object, e As EventArgs) Handles txtGuess.TextChanged

    End Sub

    Private Sub lblInstructions_Click(sender As Object, e As EventArgs) Handles lblInstructions.Click

    End Sub
End Class
