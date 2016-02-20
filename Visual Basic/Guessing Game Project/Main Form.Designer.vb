<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmMain
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.btnGuess = New System.Windows.Forms.Button()
        Me.lblName = New System.Windows.Forms.Label()
        Me.lblMsg = New System.Windows.Forms.Label()
        Me.lblInstructions = New System.Windows.Forms.Label()
        Me.txtGuess = New System.Windows.Forms.TextBox()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.lblGuessBelow = New System.Windows.Forms.Label()
        Me.picTemp = New System.Windows.Forms.PictureBox()
        Me.picCold = New System.Windows.Forms.PictureBox()
        Me.picHot = New System.Windows.Forms.PictureBox()
        Me.picMoney = New System.Windows.Forms.PictureBox()
        Me.btnStart = New System.Windows.Forms.Button()
        Me.lblPressStart = New System.Windows.Forms.Label()
        CType(Me.picTemp, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picCold, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picHot, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picMoney, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnGuess
        '
        Me.btnGuess.Font = New System.Drawing.Font("Modern No. 20", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnGuess.Location = New System.Drawing.Point(361, 239)
        Me.btnGuess.Name = "btnGuess"
        Me.btnGuess.Size = New System.Drawing.Size(75, 49)
        Me.btnGuess.TabIndex = 1
        Me.btnGuess.Text = "&Guess"
        Me.btnGuess.UseVisualStyleBackColor = True
        '
        'lblName
        '
        Me.lblName.AutoSize = True
        Me.lblName.Font = New System.Drawing.Font("Modern No. 20", 24.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblName.Location = New System.Drawing.Point(209, 12)
        Me.lblName.Name = "lblName"
        Me.lblName.Size = New System.Drawing.Size(389, 34)
        Me.lblName.TabIndex = 4
        Me.lblName.Text = "Temperature Guessing Game"
        '
        'lblMsg
        '
        Me.lblMsg.AutoSize = True
        Me.lblMsg.Font = New System.Drawing.Font("Segoe Print", 12.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblMsg.Location = New System.Drawing.Point(12, 195)
        Me.lblMsg.Name = "lblMsg"
        Me.lblMsg.Size = New System.Drawing.Size(188, 28)
        Me.lblMsg.TabIndex = 8
        Me.lblMsg.Text = "Welcome to the game!"
        Me.lblMsg.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblInstructions
        '
        Me.lblInstructions.AutoSize = True
        Me.lblInstructions.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblInstructions.Location = New System.Drawing.Point(211, 57)
        Me.lblInstructions.Name = "lblInstructions"
        Me.lblInstructions.Size = New System.Drawing.Size(310, 20)
        Me.lblInstructions.TabIndex = 5
        Me.lblInstructions.Text = "Please guess a number between 1 and 25."
        '
        'txtGuess
        '
        Me.txtGuess.Location = New System.Drawing.Point(215, 160)
        Me.txtGuess.Name = "txtGuess"
        Me.txtGuess.Size = New System.Drawing.Size(100, 20)
        Me.txtGuess.TabIndex = 0
        '
        'btnExit
        '
        Me.btnExit.Font = New System.Drawing.Font("Modern No. 20", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(523, 239)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 49)
        Me.btnExit.TabIndex = 3
        Me.btnExit.Text = "E&xit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'lblGuessBelow
        '
        Me.lblGuessBelow.AutoSize = True
        Me.lblGuessBelow.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGuessBelow.Location = New System.Drawing.Point(211, 121)
        Me.lblGuessBelow.Name = "lblGuessBelow"
        Me.lblGuessBelow.Size = New System.Drawing.Size(178, 20)
        Me.lblGuessBelow.TabIndex = 7
        Me.lblGuessBelow.Text = "Enter your guess below."
        '
        'picTemp
        '
        Me.picTemp.Image = Global.Guessing_Game_Project.My.Resources.Resources.temp
        Me.picTemp.Location = New System.Drawing.Point(13, 12)
        Me.picTemp.Name = "picTemp"
        Me.picTemp.Size = New System.Drawing.Size(171, 168)
        Me.picTemp.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picTemp.TabIndex = 7
        Me.picTemp.TabStop = False
        '
        'picCold
        '
        Me.picCold.Image = Global.Guessing_Game_Project.My.Resources.Resources.cold
        Me.picCold.Location = New System.Drawing.Point(13, 306)
        Me.picCold.Name = "picCold"
        Me.picCold.Size = New System.Drawing.Size(171, 168)
        Me.picCold.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picCold.TabIndex = 8
        Me.picCold.TabStop = False
        Me.picCold.Visible = False
        '
        'picHot
        '
        Me.picHot.Image = Global.Guessing_Game_Project.My.Resources.Resources.hot
        Me.picHot.Location = New System.Drawing.Point(215, 306)
        Me.picHot.Name = "picHot"
        Me.picHot.Size = New System.Drawing.Size(171, 168)
        Me.picHot.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picHot.TabIndex = 9
        Me.picHot.TabStop = False
        Me.picHot.Visible = False
        '
        'picMoney
        '
        Me.picMoney.Image = Global.Guessing_Game_Project.My.Resources.Resources.money
        Me.picMoney.Location = New System.Drawing.Point(408, 306)
        Me.picMoney.Name = "picMoney"
        Me.picMoney.Size = New System.Drawing.Size(171, 168)
        Me.picMoney.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picMoney.TabIndex = 10
        Me.picMoney.TabStop = False
        Me.picMoney.Visible = False
        '
        'btnStart
        '
        Me.btnStart.Font = New System.Drawing.Font("Modern No. 20", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnStart.Location = New System.Drawing.Point(442, 239)
        Me.btnStart.Name = "btnStart"
        Me.btnStart.Size = New System.Drawing.Size(75, 49)
        Me.btnStart.TabIndex = 2
        Me.btnStart.Text = "&Start"
        Me.btnStart.UseVisualStyleBackColor = True
        '
        'lblPressStart
        '
        Me.lblPressStart.AutoSize = True
        Me.lblPressStart.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblPressStart.Location = New System.Drawing.Point(211, 88)
        Me.lblPressStart.Name = "lblPressStart"
        Me.lblPressStart.Size = New System.Drawing.Size(249, 20)
        Me.lblPressStart.TabIndex = 6
        Me.lblPressStart.Text = "Press 'Start' to begin a new game."
        '
        'frmMain
        '
        Me.AcceptButton = Me.btnGuess
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(618, 313)
        Me.Controls.Add(Me.lblPressStart)
        Me.Controls.Add(Me.btnStart)
        Me.Controls.Add(Me.picMoney)
        Me.Controls.Add(Me.picHot)
        Me.Controls.Add(Me.picCold)
        Me.Controls.Add(Me.picTemp)
        Me.Controls.Add(Me.lblGuessBelow)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.txtGuess)
        Me.Controls.Add(Me.lblInstructions)
        Me.Controls.Add(Me.lblMsg)
        Me.Controls.Add(Me.lblName)
        Me.Controls.Add(Me.btnGuess)
        Me.Name = "frmMain"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Hot, Cold, Money!"
        CType(Me.picTemp, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picCold, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picHot, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picMoney, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnGuess As System.Windows.Forms.Button
    Friend WithEvents lblName As System.Windows.Forms.Label
    Friend WithEvents lblMsg As System.Windows.Forms.Label
    Friend WithEvents lblInstructions As System.Windows.Forms.Label
    Friend WithEvents txtGuess As System.Windows.Forms.TextBox
    Friend WithEvents btnExit As System.Windows.Forms.Button
    Friend WithEvents lblGuessBelow As System.Windows.Forms.Label
    Friend WithEvents picTemp As System.Windows.Forms.PictureBox
    Friend WithEvents picCold As System.Windows.Forms.PictureBox
    Friend WithEvents picHot As System.Windows.Forms.PictureBox
    Friend WithEvents picMoney As System.Windows.Forms.PictureBox
    Friend WithEvents btnStart As System.Windows.Forms.Button
    Friend WithEvents lblPressStart As System.Windows.Forms.Label

End Class
