import React from 'react';
import Image from '../../elements/Image';

const ChallengeCard  = (props)=>{
const iconPath = require('./../../../assets/images/feature-tile-icon-0'+props.typeId+'.svg');

return (
            <div className="tiles-item reveal-from-bottom is-revealed" data-reveal-delay="200">
              <div className="tiles-item-inner">
                <div className="features-tiles-item-header">
                  <div className="features-tiles-item-image mb-16">
                    <Image
                      src={iconPath}
                      alt="Challenge type icon "
                      width={64}
                      height={64} />
                  </div>
                </div>
                <div className="features-tiles-item-content">
                  <h4 className="mt-0 mb-8">
                    {props.name}
                    </h4>
                  <p className="m-0 text-sm">
                    Period => ({props.startDate} - {props.endDate})
                    Type => {props.type}
                    </p>
                </div>
              </div>
            </div>
    )

}
export default ChallengeCard;