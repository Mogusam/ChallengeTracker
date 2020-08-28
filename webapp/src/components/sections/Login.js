import React from 'react';
import Input from '../elements/Input';
import Button from '../elements/Button';
import ButtonGroup from '../elements/ButtonGroup';
import GenericSection from './GenericSection';
import Footer from '../layout/Footer';

const Login = () => {



  return (
    <GenericSection  center-content>
      <div className="container-250 " >
        <form>
          <fieldset>
            <div className="m-4" align='left'>
              <Input type="text"  size="sm" placeholder="Username" hint='Nickname or email' />
            </div>
            <div className="m-4">
              <Input type="password" size="sm" placeholder="Password" hint='Secret password' />
            </div>
            <div className="mb-8 center-content">
              <ButtonGroup >
                <Button color="primary">Log in</Button>
                <Button color="secondary">New User</Button>
              </ButtonGroup>
            </div>
          </fieldset>
        </form>
       
      </div>






    </GenericSection>

  )


}



export default Login;