package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEocarcinus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEocarcinus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer MandibleR;
    private final AdvancedModelRenderer MandibleL;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer clawR2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer clawR3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer pincerR;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer clawL2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer clawL3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer pincerL;

    public ModelEocarcinus() {
        this.textureWidth = 42;
        this.textureHeight = 26;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(1.5083F, 21.442F, 0.272F);
        this.setRotateAngle(body, -0.2007F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 6, 3, -2.5083F, -2.242F, -5.922F, 2, 0, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5083F, -2.142F, 0.728F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, -1.0F, -1.7324F, 1.591F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.3652F, -1.8594F, 2.078F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 3, -1.0F, 0.0F, -8.0F, 3, 0, 9, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.6947F, -0.0712F, 1.078F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1291F, -0.0533F, -0.3893F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 3, 0.1152F, 0.0793F, -7.0F, 3, 0, 8, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5083F, 0.6864F, -1.272F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.9844F, -0.3614F, -0.4215F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 6, 1.2663F, -0.3234F, -2.2177F, 2, 0, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5083F, 0.6864F, 0.728F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -3.1416F, 0.0F, -0.3927F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 16, 0.9622F, -0.2903F, -2.35F, 2, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5083F, -0.7278F, 2.1423F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -2.3957F, 0.274F, -0.2849F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 14, 0.315F, -1.8526F, -1.7324F, 2, 0, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5083F, -2.142F, 0.728F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7459F, 0.274F, 0.2849F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 12, 0.2609F, -1.9832F, 1.591F, 2, 0, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.3818F, -1.8594F, 2.078F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3927F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 3, -2.0F, 0.0F, -8.0F, 3, 0, 9, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5083F, -1.392F, -5.922F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 10, -1.5F, -0.5F, 0.15F, 3, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.3219F, -0.0712F, 1.078F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1291F, 0.0533F, 0.3893F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 3, -3.1152F, 0.0793F, -7.0F, 3, 0, 8, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5083F, 1.958F, 1.078F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, -1.0F, -2.0F, -7.0F, 2, 0, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5083F, 0.6864F, -1.272F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -2.9844F, 0.3614F, 0.4215F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 3, 6, -3.2663F, -0.3234F, -2.2177F, 2, 0, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5083F, 0.6864F, -1.272F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -3.1416F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 19, -1.0F, 0.1F, -2.35F, 2, 0, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5083F, -2.142F, 0.728F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7459F, -0.274F, -0.2849F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 12, -2.2609F, -1.9832F, 1.591F, 2, 0, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5083F, -0.7278F, 2.1423F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -2.3957F, -0.274F, 0.2849F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 14, -2.315F, -1.8526F, -1.7324F, 2, 0, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5083F, 0.6864F, 0.728F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -3.1416F, 0.0F, 0.3927F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 16, -2.9622F, -0.2903F, -2.35F, 2, 0, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5083F, -0.342F, -6.422F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3622F, -0.7519F, 0.2533F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -0.5F, -1.95F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5083F, 0.6864F, 0.728F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -3.1416F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 15, -1.0F, 0.1F, -2.35F, 2, 1, 2, 0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5083F, -0.7278F, 2.1423F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -2.3562F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 18, -1.0F, -1.591F, -1.7324F, 2, 1, 2, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-2.0098F, -1.4961F, -5.3708F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, -0.3031F, 0.2005F, -0.2688F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 4, 3, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(-1.0069F, -1.4961F, -5.3708F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, -0.3031F, -0.2005F, 0.2688F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 4, 3, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, true));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-2.9034F, -2.0093F, -5.8179F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2618F, 0.2618F, -0.3927F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 18, 3, -1.5F, 0.001F, -7.0F, 2, 0, 7, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(-0.1132F, -2.0093F, -5.8179F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2618F, -0.2618F, 0.3927F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 18, 3, -0.5F, 0.001F, -7.0F, 2, 0, 7, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-2.9454F, -0.6553F, 0.3039F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.5777F, -0.4748F, -0.3436F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 12, -10.0F, 0.001F, -1.5F, 10, 0, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(-0.0713F, -0.6553F, 0.3039F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.5777F, 0.4748F, 0.3436F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 12, 0.0F, 0.001F, -1.5F, 10, 0, 3, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-3.1654F, -0.7297F, 1.3279F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, -0.7026F, -0.23F, -0.2265F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -11.0F, 0.001F, -1.5F, 11, 0, 3, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.1488F, -0.7297F, 1.3279F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, -0.7026F, 0.23F, 0.2265F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, 0.0F, 0.001F, -1.5F, 11, 0, 3, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-3.0756F, -1.1906F, 2.1962F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, -0.7806F, 0.1096F, -0.171F);
        this.legR3.cubeList.add(new ModelBox(legR3, 8, 15, -7.0F, 0.001F, -1.5F, 7, 0, 4, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.059F, -1.1906F, 2.1962F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, -0.7806F, -0.1096F, 0.171F);
        this.legL3.cubeList.add(new ModelBox(legL3, 8, 15, 0.0F, 0.001F, -1.5F, 7, 0, 4, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.5064F, -1.8068F, 3.157F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, -0.8607F, 0.4564F, -0.2432F);
        this.legR4.cubeList.add(new ModelBox(legR4, 8, 19, -6.0F, 0.001F, -1.5F, 6, 0, 4, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(-0.5102F, -1.8068F, 3.157F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, -0.8607F, -0.4564F, 0.2432F);
        this.legL4.cubeList.add(new ModelBox(legL4, 8, 19, 0.0F, 0.001F, -1.5F, 6, 0, 4, 0.0F, true));

        this.MandibleR = new AdvancedModelRenderer(this);
        this.MandibleR.setRotationPoint(-2.441F, -0.5152F, -2.5699F);
        this.body.addChild(MandibleR);
        this.setRotateAngle(MandibleR, -0.0923F, -0.043F, 0.0023F);
        this.MandibleR.cubeList.add(new ModelBox(MandibleR, 0, 6, -0.25F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.MandibleL = new AdvancedModelRenderer(this);
        this.MandibleL.setRotationPoint(-0.5756F, -0.5152F, -2.5699F);
        this.body.addChild(MandibleL);
        this.setRotateAngle(MandibleL, -0.0923F, 0.043F, -0.0023F);
        this.MandibleL.cubeList.add(new ModelBox(MandibleL, 0, 6, -0.75F, 0.0F, -3.0F, 1, 0, 3, 0.0F, true));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(-2.2268F, -0.159F, -1.2752F);
        this.body.addChild(clawR);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawR.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6757F, -0.7738F, -0.1449F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 21, -8.0F, -0.5F, -1.0F, 8, 1, 2, 0.0F, false));

        this.clawR2 = new AdvancedModelRenderer(this);
        this.clawR2.setRotationPoint(-5.6623F, 0.826F, -5.5907F);
        this.clawR.addChild(clawR2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawR2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -3.1013F, -0.2719F, -0.9813F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 3, -0.5425F, 0.0973F, -0.6786F, 2, 1, 2, 0.0F, false));

        this.clawR3 = new AdvancedModelRenderer(this);
        this.clawR3.setRotationPoint(-0.1856F, -0.0354F, -0.4268F);
        this.clawR2.addChild(clawR3);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5357F, 1.8971F, -2.0719F);
        this.clawR3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -2.3592F, -0.3567F, -2.7174F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 24, -3.6F, -1.0F, 0.0F, 4, 1, 1, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawR3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -2.4602F, -0.904F, -2.6816F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 21, -3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.pincerR = new AdvancedModelRenderer(this);
        this.pincerR.setRotationPoint(1.5294F, 0.4061F, -2.596F);
        this.clawR3.addChild(pincerR);
        this.setRotateAngle(pincerR, -2.3544F, -0.1937F, -2.5453F);
        this.pincerR.cubeList.add(new ModelBox(pincerR, 9, 23, -4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(-0.7898F, -0.159F, -1.2752F);
        this.body.addChild(clawL);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawL.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6757F, 0.7738F, 0.1449F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 21, 0.0F, -0.5F, -1.0F, 8, 1, 2, 0.0F, true));

        this.clawL2 = new AdvancedModelRenderer(this);
        this.clawL2.setRotationPoint(5.6623F, 0.826F, -5.5907F);
        this.clawL.addChild(clawL2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawL2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -3.1013F, 0.2719F, 0.9813F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 3, -1.4575F, 0.0973F, -0.6786F, 2, 1, 2, 0.0F, true));

        this.clawL3 = new AdvancedModelRenderer(this);
        this.clawL3.setRotationPoint(0.1856F, -0.0354F, -0.4268F);
        this.clawL2.addChild(clawL3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5357F, 1.8971F, -2.0719F);
        this.clawL3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -2.3592F, 0.3567F, 2.7174F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 24, -0.4F, -1.0F, 0.0F, 4, 1, 1, -0.001F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawL3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -2.4602F, 0.904F, 2.6816F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 21, 0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.pincerL = new AdvancedModelRenderer(this);
        this.pincerL.setRotationPoint(-1.5294F, 0.4061F, -2.596F);
        this.clawL3.addChild(pincerL);
        this.setRotateAngle(pincerL, -2.3569F, 0.206F, 2.5327F);
        this.pincerL.cubeList.add(new ModelBox(pincerL, 9, 23, 0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.01F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    
    public void renderStaticFloor(float f) {
        this.setRotateAngle(clawR, -0.2F, -0.3F, 0.0F);
        this.setRotateAngle(clawR2, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(clawR3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(clawL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(clawL2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(clawL3, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = 0.12F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEocarcinus ee = (EntityPrehistoricFloraEocarcinus) entitylivingbaseIn;

        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
            }

        }
        else {
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEocarcinus entity = (EntityPrehistoricFloraEocarcinus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.4 + (((tickAnim - 0) / 5) * (-0.75-(-2.4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 0) / 5) * (-1.93-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.75 + (((tickAnim - 5) / 4) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = -1.93 + (((tickAnim - 5) / 4) * (-0.16667-(-1.93)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = -0.16667 + (((tickAnim - 9) / 6) * (1.87-(-0.16667)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.75 + (((tickAnim - 15) / 5) * (-2.5-(-0.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 1.87 + (((tickAnim - 15) / 5) * (2.5-(1.87)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 20) / 5) * (-4.15-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 20) / 5) * (1.87-(2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -4.15 + (((tickAnim - 25) / 6) * (-5-(-4.15)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 1.87 + (((tickAnim - 25) / 6) * (-0.16667-(1.87)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 31) / 4) * (-4.15-(-5)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = -0.16667 + (((tickAnim - 31) / 4) * (-1.93-(-0.16667)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.15 + (((tickAnim - 35) / 5) * (-2.4-(-4.15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -1.93 + (((tickAnim - 35) / 5) * (-2.5-(-1.93)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(antennaR, antennaR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*5), antennaR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(antennaL, antennaL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*5), antennaL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-145))*2.5), antennaL.rotateAngleZ + (float) Math.toRadians(0));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.51466-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-12.19421-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (17.06847-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.51466 + (((tickAnim - 5) / 5) * (8.46186-(5.51466)));
            yy = -12.19421 + (((tickAnim - 5) / 5) * (-15.70935-(-12.19421)));
            zz = 17.06847 + (((tickAnim - 5) / 5) * (-8.42763-(17.06847)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.46186 + (((tickAnim - 10) / 10) * (0-(8.46186)));
            yy = -15.70935 + (((tickAnim - 10) / 10) * (0-(-15.70935)));
            zz = -8.42763 + (((tickAnim - 10) / 10) * (0-(-8.42763)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (5.51466-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-12.19421-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (17.06847-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 5.51466 + (((tickAnim - 25) / 5) * (8.46186-(5.51466)));
            yy = -12.19421 + (((tickAnim - 25) / 5) * (-15.70935-(-12.19421)));
            zz = 17.06847 + (((tickAnim - 25) / 5) * (-8.42763-(17.06847)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.46186 + (((tickAnim - 30) / 10) * (0-(8.46186)));
            yy = -15.70935 + (((tickAnim - 30) / 10) * (0-(-15.70935)));
            zz = -8.42763 + (((tickAnim - 30) / 10) * (0-(-8.42763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.48 + (((tickAnim - 0) / 2) * (8.46186-(7.48)));
            yy = 14.54 + (((tickAnim - 0) / 2) * (15.70935-(14.54)));
            zz = -0.07 + (((tickAnim - 0) / 2) * (8.42763-(-0.07)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 8.46186 + (((tickAnim - 2) / 10) * (0-(8.46186)));
            yy = 15.70935 + (((tickAnim - 2) / 10) * (0-(15.70935)));
            zz = 8.42763 + (((tickAnim - 2) / 10) * (0-(8.42763)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (5.51466-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (12.19421-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-17.06847-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 5.51466 + (((tickAnim - 17) / 5) * (8.46186-(5.51466)));
            yy = 12.19421 + (((tickAnim - 17) / 5) * (15.70935-(12.19421)));
            zz = -17.06847 + (((tickAnim - 17) / 5) * (8.42763-(-17.06847)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 8.46186 + (((tickAnim - 22) / 10) * (0-(8.46186)));
            yy = 15.70935 + (((tickAnim - 22) / 10) * (0-(15.70935)));
            zz = 8.42763 + (((tickAnim - 22) / 10) * (0-(8.42763)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (5.51466-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (12.19421-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-17.06847-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 5.51466 + (((tickAnim - 37) / 3) * (7.48-(5.51466)));
            yy = 12.19421 + (((tickAnim - 37) / 3) * (14.54-(12.19421)));
            zz = -17.06847 + (((tickAnim - 37) / 3) * (-0.07-(-17.06847)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.35 + (((tickAnim - 0) / 3) * (4.95152-(2.35)));
            yy = -8.37 + (((tickAnim - 0) / 3) * (-16.52155-(-8.37)));
            zz = 12.37 + (((tickAnim - 0) / 3) * (-5.34502-(12.37)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 4.95152 + (((tickAnim - 3) / 10) * (-3.2945-(4.95152)));
            yy = -16.52155 + (((tickAnim - 3) / 10) * (16.83111-(-16.52155)));
            zz = -5.34502 + (((tickAnim - 3) / 10) * (3.79181-(-5.34502)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.2945 + (((tickAnim - 13) / 5) * (1.05027-(-3.2945)));
            yy = 16.83111 + (((tickAnim - 13) / 5) * (-4.29822-(16.83111)));
            zz = 3.79181 + (((tickAnim - 13) / 5) * (21.22451-(3.79181)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.05027 + (((tickAnim - 18) / 5) * (4.95152-(1.05027)));
            yy = -4.29822 + (((tickAnim - 18) / 5) * (-16.52155-(-4.29822)));
            zz = 21.22451 + (((tickAnim - 18) / 5) * (-5.34502-(21.22451)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 4.95152 + (((tickAnim - 23) / 10) * (-3.2945-(4.95152)));
            yy = -16.52155 + (((tickAnim - 23) / 10) * (16.83111-(-16.52155)));
            zz = -5.34502 + (((tickAnim - 23) / 10) * (3.79181-(-5.34502)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -3.2945 + (((tickAnim - 33) / 5) * (1.05027-(-3.2945)));
            yy = 16.83111 + (((tickAnim - 33) / 5) * (-4.29822-(16.83111)));
            zz = 3.79181 + (((tickAnim - 33) / 5) * (21.22451-(3.79181)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.05027 + (((tickAnim - 38) / 2) * (2.35-(1.05027)));
            yy = -4.29822 + (((tickAnim - 38) / 2) * (-8.37-(-4.29822)));
            zz = 21.22451 + (((tickAnim - 38) / 2) * (12.37-(21.22451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.83 + (((tickAnim - 0) / 5) * (-3.2945-(0.83)));
            yy = -0.15 + (((tickAnim - 0) / 5) * (-16.83111-(-0.15)));
            zz = 0.78 + (((tickAnim - 0) / 5) * (-3.79181-(0.78)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.2945 + (((tickAnim - 5) / 5) * (1.05027-(-3.2945)));
            yy = -16.83111 + (((tickAnim - 5) / 5) * (4.29822-(-16.83111)));
            zz = -3.79181 + (((tickAnim - 5) / 5) * (-21.22451-(-3.79181)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.05027 + (((tickAnim - 10) / 5) * (4.95152-(1.05027)));
            yy = 4.29822 + (((tickAnim - 10) / 5) * (16.52155-(4.29822)));
            zz = -21.22451 + (((tickAnim - 10) / 5) * (5.34502-(-21.22451)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 4.95152 + (((tickAnim - 15) / 10) * (-3.2945-(4.95152)));
            yy = 16.52155 + (((tickAnim - 15) / 10) * (-16.83111-(16.52155)));
            zz = 5.34502 + (((tickAnim - 15) / 10) * (-3.79181-(5.34502)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.2945 + (((tickAnim - 25) / 5) * (1.05027-(-3.2945)));
            yy = -16.83111 + (((tickAnim - 25) / 5) * (4.29822-(-16.83111)));
            zz = -3.79181 + (((tickAnim - 25) / 5) * (-21.22451-(-3.79181)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.05027 + (((tickAnim - 30) / 5) * (4.95152-(1.05027)));
            yy = 4.29822 + (((tickAnim - 30) / 5) * (16.52155-(4.29822)));
            zz = -21.22451 + (((tickAnim - 30) / 5) * (5.34502-(-21.22451)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 4.95152 + (((tickAnim - 35) / 5) * (0.83-(4.95152)));
            yy = 16.52155 + (((tickAnim - 35) / 5) * (-0.15-(16.52155)));
            zz = 5.34502 + (((tickAnim - 35) / 5) * (0.78-(5.34502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.57 + (((tickAnim - 0) / 2) * (-2.57129-(-1.57)));
            yy = 11.34 + (((tickAnim - 0) / 2) * (16.96639-(11.34)));
            zz = 1.77 + (((tickAnim - 0) / 2) * (2.85264-(1.77)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -2.57129 + (((tickAnim - 2) / 5) * (0.37046-(-2.57129)));
            yy = 16.96639 + (((tickAnim - 2) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 2) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0.37046 + (((tickAnim - 7) / 5) * (3.4427-(0.37046)));
            yy = -4.37439 + (((tickAnim - 7) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 7) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 3.4427 + (((tickAnim - 12) / 10) * (-2.57129-(3.4427)));
            yy = -16.79985 + (((tickAnim - 12) / 10) * (16.96639-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 12) / 10) * (2.85264-(-3.64399)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -2.57129 + (((tickAnim - 22) / 5) * (0.37046-(-2.57129)));
            yy = 16.96639 + (((tickAnim - 22) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 22) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0.37046 + (((tickAnim - 27) / 5) * (3.4427-(0.37046)));
            yy = -4.37439 + (((tickAnim - 27) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 27) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 3.4427 + (((tickAnim - 32) / 8) * (-1.57-(3.4427)));
            yy = -16.79985 + (((tickAnim - 32) / 8) * (11.34-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 32) / 8) * (1.77-(-3.64399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.39 + (((tickAnim - 0) / 3) * (3.4427-(1.39)));
            yy = 8.52 + (((tickAnim - 0) / 3) * (16.79985-(8.52)));
            zz = -13.22 + (((tickAnim - 0) / 3) * (3.64399-(-13.22)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 3.4427 + (((tickAnim - 3) / 10) * (-2.57129-(3.4427)));
            yy = 16.79985 + (((tickAnim - 3) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 3) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.57129 + (((tickAnim - 13) / 5) * (0.37046-(-2.57129)));
            yy = -16.96639 + (((tickAnim - 13) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 13) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.37046 + (((tickAnim - 18) / 5) * (3.4427-(0.37046)));
            yy = 4.37439 + (((tickAnim - 18) / 5) * (16.79985-(4.37439)));
            zz = -21.65911 + (((tickAnim - 18) / 5) * (3.64399-(-21.65911)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 3.4427 + (((tickAnim - 23) / 10) * (-2.57129-(3.4427)));
            yy = 16.79985 + (((tickAnim - 23) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 23) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.57129 + (((tickAnim - 33) / 5) * (0.37046-(-2.57129)));
            yy = -16.96639 + (((tickAnim - 33) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 33) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.37046 + (((tickAnim - 38) / 2) * (1.39-(0.37046)));
            yy = 4.37439 + (((tickAnim - 38) / 2) * (8.52-(4.37439)));
            zz = -21.65911 + (((tickAnim - 38) / 2) * (-13.22-(-21.65911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.18624 + (((tickAnim - 0) / 5) * (4.63788-(0.18624)));
            yy = -4.39691 + (((tickAnim - 0) / 5) * (-16.57347-(-4.39691)));
            zz = 21.50803 + (((tickAnim - 0) / 5) * (-2.07666-(21.50803)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 4.63788 + (((tickAnim - 5) / 10) * (-4.86371-(4.63788)));
            yy = -16.57347 + (((tickAnim - 5) / 10) * (16.67917-(-16.57347)));
            zz = -2.07666 + (((tickAnim - 5) / 10) * (0.73038-(-2.07666)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.86371 + (((tickAnim - 15) / 5) * (0.18624-(-4.86371)));
            yy = 16.67917 + (((tickAnim - 15) / 5) * (-4.39691-(16.67917)));
            zz = 0.73038 + (((tickAnim - 15) / 5) * (21.50803-(0.73038)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.18624 + (((tickAnim - 20) / 5) * (4.63788-(0.18624)));
            yy = -4.39691 + (((tickAnim - 20) / 5) * (-16.57347-(-4.39691)));
            zz = 21.50803 + (((tickAnim - 20) / 5) * (-2.07666-(21.50803)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.63788 + (((tickAnim - 25) / 10) * (-4.86371-(4.63788)));
            yy = -16.57347 + (((tickAnim - 25) / 10) * (16.67917-(-16.57347)));
            zz = -2.07666 + (((tickAnim - 25) / 10) * (0.73038-(-2.07666)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.86371 + (((tickAnim - 35) / 5) * (0.18624-(-4.86371)));
            yy = 16.67917 + (((tickAnim - 35) / 5) * (-4.39691-(16.67917)));
            zz = 0.73038 + (((tickAnim - 35) / 5) * (21.50803-(0.73038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.47 + (((tickAnim - 0) / 7) * (-4.86371-(1.47)));
            yy = 5.49 + (((tickAnim - 0) / 7) * (-16.67917-(5.49)));
            zz = 1.14 + (((tickAnim - 0) / 7) * (-0.73038-(1.14)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -4.86371 + (((tickAnim - 7) / 5) * (0.18624-(-4.86371)));
            yy = -16.67917 + (((tickAnim - 7) / 5) * (4.39691-(-16.67917)));
            zz = -0.73038 + (((tickAnim - 7) / 5) * (-21.50803-(-0.73038)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0.18624 + (((tickAnim - 12) / 5) * (4.63788-(0.18624)));
            yy = 4.39691 + (((tickAnim - 12) / 5) * (16.57347-(4.39691)));
            zz = -21.50803 + (((tickAnim - 12) / 5) * (2.07666-(-21.50803)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 4.63788 + (((tickAnim - 17) / 10) * (-4.86371-(4.63788)));
            yy = 16.57347 + (((tickAnim - 17) / 10) * (-16.67917-(16.57347)));
            zz = 2.07666 + (((tickAnim - 17) / 10) * (-0.73038-(2.07666)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -4.86371 + (((tickAnim - 27) / 5) * (0.18624-(-4.86371)));
            yy = -16.67917 + (((tickAnim - 27) / 5) * (4.39691-(-16.67917)));
            zz = -0.73038 + (((tickAnim - 27) / 5) * (-21.50803-(-0.73038)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0.18624 + (((tickAnim - 32) / 5) * (4.63788-(0.18624)));
            yy = 4.39691 + (((tickAnim - 32) / 5) * (16.57347-(4.39691)));
            zz = -21.50803 + (((tickAnim - 32) / 5) * (2.07666-(-21.50803)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 4.63788 + (((tickAnim - 37) / 3) * (1.47-(4.63788)));
            yy = 16.57347 + (((tickAnim - 37) / 3) * (5.49-(16.57347)));
            zz = 2.07666 + (((tickAnim - 37) / 3) * (1.14-(2.07666)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+115))*2), clawR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*4), clawR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-115))*2), clawL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-145))*4), clawL.rotateAngleZ + (float) Math.toRadians(0));
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        EntityPrehistoricFloraEocarcinus ee = (EntityPrehistoricFloraEocarcinus) e;
        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                //Do the BB animation
            }
            else {
                this.swing(antennaL, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
                this.swing(antennaR, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            }
        }
        else {
            this.swing(antennaL, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(antennaR, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
        }

    }
}
