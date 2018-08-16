using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using DropzoneMobile.AuditTool.Views;

[assembly: XamlCompilation(XamlCompilationOptions.Compile)]
namespace DropzoneMobile.AuditTool
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            MainPage = new ToolSelectionVIew();
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}
