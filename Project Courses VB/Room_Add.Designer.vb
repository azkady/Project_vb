<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Room_Add
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Room_Add))
        Me.btnSaveroom = New System.Windows.Forms.Button()
        Me.txtStudentClass = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtRoomname = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.btnLroom = New System.Windows.Forms.Button()
        Me.txtCapacity = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnSaveroom
        '
        Me.btnSaveroom.BackColor = System.Drawing.Color.CornflowerBlue
        Me.btnSaveroom.Location = New System.Drawing.Point(148, 293)
        Me.btnSaveroom.Name = "btnSaveroom"
        Me.btnSaveroom.Size = New System.Drawing.Size(110, 43)
        Me.btnSaveroom.TabIndex = 1
        Me.btnSaveroom.Text = "Add Room"
        Me.btnSaveroom.UseVisualStyleBackColor = False
        '
        'txtStudentClass
        '
        Me.txtStudentClass.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtStudentClass.Location = New System.Drawing.Point(228, 166)
        Me.txtStudentClass.Multiline = True
        Me.txtStudentClass.Name = "txtStudentClass"
        Me.txtStudentClass.Size = New System.Drawing.Size(185, 40)
        Me.txtStudentClass.TabIndex = 4
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label2.ForeColor = System.Drawing.Color.White
        Me.Label2.Location = New System.Drawing.Point(25, 172)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(197, 31)
        Me.Label2.TabIndex = 3
        Me.Label2.Text = "Student Class"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.Color.White
        Me.Label4.Location = New System.Drawing.Point(86, 51)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(224, 31)
        Me.Label4.TabIndex = 7
        Me.Label4.Text = "Add Room Form"
        '
        'txtRoomname
        '
        Me.txtRoomname.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtRoomname.Location = New System.Drawing.Point(228, 107)
        Me.txtRoomname.Multiline = True
        Me.txtRoomname.Name = "txtRoomname"
        Me.txtRoomname.Size = New System.Drawing.Size(185, 40)
        Me.txtRoomname.TabIndex = 10
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label1.ForeColor = System.Drawing.Color.White
        Me.Label1.Location = New System.Drawing.Point(25, 110)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(174, 31)
        Me.Label1.TabIndex = 9
        Me.Label1.Text = "Room Name"
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox1.BackgroundImage = CType(resources.GetObject("PictureBox1.BackgroundImage"), System.Drawing.Image)
        Me.PictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox1.Location = New System.Drawing.Point(191, 7)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(48, 37)
        Me.PictureBox1.TabIndex = 20
        Me.PictureBox1.TabStop = False
        '
        'btnLroom
        '
        Me.btnLroom.BackColor = System.Drawing.Color.CornflowerBlue
        Me.btnLroom.Location = New System.Drawing.Point(303, 293)
        Me.btnLroom.Name = "btnLroom"
        Me.btnLroom.Size = New System.Drawing.Size(110, 43)
        Me.btnLroom.TabIndex = 21
        Me.btnLroom.Text = "Room List"
        Me.btnLroom.UseVisualStyleBackColor = False
        '
        'txtCapacity
        '
        Me.txtCapacity.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtCapacity.Location = New System.Drawing.Point(228, 226)
        Me.txtCapacity.Multiline = True
        Me.txtCapacity.Name = "txtCapacity"
        Me.txtCapacity.Size = New System.Drawing.Size(185, 40)
        Me.txtCapacity.TabIndex = 22
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label3.ForeColor = System.Drawing.Color.White
        Me.Label3.Location = New System.Drawing.Point(25, 235)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(129, 31)
        Me.Label3.TabIndex = 23
        Me.Label3.Text = "Capacity"
        '
        'Room_Add
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.DeepSkyBlue
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(442, 378)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.txtCapacity)
        Me.Controls.Add(Me.btnLroom)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.txtRoomname)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.txtStudentClass)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.btnSaveroom)
        Me.Name = "Room_Add"
        Me.Text = "Room_Add"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents btnSaveroom As Button
    Friend WithEvents txtStudentClass As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents txtRoomname As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents btnLroom As Button
    Friend WithEvents txtCapacity As TextBox
    Friend WithEvents Label3 As Label
End Class
