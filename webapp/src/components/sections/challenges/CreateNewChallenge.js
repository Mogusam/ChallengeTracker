import React from 'react';
import Image from '../../elements/Image';
import { Link } from 'react-router-dom';

const CreateNewChallenge  = (props)=>{
const iconPath = require('./../../../assets/images/create-new.png');
const createNewLink = '/newChallenge';
return (
            <Link to={createNewLink} >
                <div className=" mb-16 center-content">
                    <Image
                      src={iconPath}
                      alt="Create new "
                      width={164}
                      height={64} />
                </div>
            </Link>
    )
}
export default CreateNewChallenge;