using System;
using System.Collections.Generic;

using Xamarin.Forms;

namespace DropzoneMobile.AuditTool.Views
{
    public partial class LoginView : ContentPage
    {
        void BtnLogin_Clicked(object sender, EventArgs e)
        {
            DisplayAlert("title", "Ha", "Ok");
        }


        public LoginView()
        {
            InitializeComponent();
            btnLogin.Clicked+= BtnLogin_Clicked;
        }
    }
}
