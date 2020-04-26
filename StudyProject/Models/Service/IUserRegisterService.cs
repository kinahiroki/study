﻿using StudyProject.Controllers.Form;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudyProject.Models.Service
{
    interface IUserRegisterService
    {
        /// <summary>
        /// ユーザ情報登録
        /// </summary>
        /// <param name="RegisterForm"></param>
        void RegisterUser(RegisterForm RegisterForm);
    }
}
