import React from 'react';
import classNames from 'classnames';
import { SectionProps } from '../../../utils/SectionProps';
const NewChallengeForm = ({className,
                             topOuterDivider,
                             bottomOuterDivider,
                             topDivider,
                             bottomDivider,
                             hasBgColor,
                             invertColor})=>{
const outerClasses = classNames(
    'hero section center-content',
    topOuterDivider && 'has-top-divider',
    bottomOuterDivider && 'has-bottom-divider',
    hasBgColor && 'has-bg-color',
    invertColor && 'invert-color',
    className
  );

  const innerClasses = classNames(
    'hero-inner section-inner',
    topDivider && 'has-top-divider',
    bottomDivider && 'has-bottom-divider'
  );

return(
    <section

      className={outerClasses}
    >
      <div className="container-sm">
        <div className={innerClasses}>
         <div className=" mb-16 center-content">
            <h4> New Challenge Form will be HERE </h4>

        </div>
        </div>
        </div>
    </section>

    )
}

export default NewChallengeForm