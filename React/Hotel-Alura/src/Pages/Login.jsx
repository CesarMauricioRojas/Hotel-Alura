import React from 'react'
import hotel from "../Imagenes/img-hotel-login-.png"
import logoHotel from "../Imagenes/aH-150px.png"
const IniciarSesion = () => {


    //handleSubmit = () =>{
    //}

  return (
    <section className='iniciar-sesion'>
        <article className='iniciar-sesion_articulo-uno'>
            <form className="form" >
                <img src={logoHotel} width={"70px"} alt="" />
                <h2>INICIAR SESION</h2>
                <label>USUARIO</label>
                <input type="text" placeholder='Ingrese su usuario'/>
                <label>CONTRASEÑA</label>
                <input type="text" placeholder='Ingrese su contraseña'/>
                <button>ENVIAR</button>
            </form>
        </article>

        <article className='iniciar-sesion_articulo-dos'>
            <img src={hotel} border={"2px green solid"} alt="" />
        </article>
    </section>
  )
}

export default IniciarSesion