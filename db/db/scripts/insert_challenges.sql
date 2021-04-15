INSERT INTO public.challenge(
          template_id, start_date, end_date, access, stop_strategy, state, moderated, challenge_type_id,
           challenge_settings)
         VALUES
         (  1, '12/12/1999', '12/12/2000', 'Y', 'F', 'I', false, 1, '{"desc":"NO"}'),
         ( 2, '12/12/2000', '12/12/2005', 'Y', 'F', 'I', false, 2, '{"desc":"YNO"}'),
         ( 1, '12/01/2005', '12/12/2006', 'Y', 'E', 'C', false, 3, '{"desc":"3NO"}'),
         ( 1, '12/12/2008', '12/12/2009', 'Y', 'E', 'I', true, 4, '{"desc":"N6O"}');
