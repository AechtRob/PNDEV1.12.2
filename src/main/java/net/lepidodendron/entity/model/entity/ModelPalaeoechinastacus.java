package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeoechinastacus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelPalaeoechinastacus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer legfrontR;
    private final AdvancedModelRenderer legfrontL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer armR1;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer armL1;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer pleopodR;
    private final AdvancedModelRenderer pleopodL;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pleopodR2;
    private final AdvancedModelRenderer pleopodL2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pleopodR3;
    private final AdvancedModelRenderer pleopodL3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pleopodR4;
    private final AdvancedModelRenderer pleopodL4;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;

    private ModelAnimator animator;


    public ModelPalaeoechinastacus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 19.05F, -7.0F);
        this.bone.cubeList.add(new ModelBox(bone, 34, 7, -1.5F, -0.05F, 0.25F, 3, 2, 1, 0.02F, false));
        this.bone.cubeList.add(new ModelBox(bone, 24, 0, -2.0F, -0.05F, 1.25F, 4, 3, 4, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 30, -2.0F, -0.05F, 5.25F, 4, 3, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 34, 13, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 38, -1.25F, 1.125F, -1.25F, 1, 0, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 38, 0.25F, 1.125F, -1.25F, 1, 0, 2, 0.0F, true));

        this.legfrontR = new AdvancedModelRenderer(this);
        this.legfrontR.setRotationPoint(-1.0F, 2.5F, 1.25F);
        this.bone.addChild(legfrontR);
        this.setRotateAngle(legfrontR, 0.0F, 0.3491F, 0.0F);
        this.legfrontR.cubeList.add(new ModelBox(legfrontR, 16, 34, 0.0F, -0.5F, -3.0F, 0, 2, 3, 0.0F, false));

        this.legfrontL = new AdvancedModelRenderer(this);
        this.legfrontL.setRotationPoint(1.0F, 2.5F, 1.25F);
        this.bone.addChild(legfrontL);
        this.setRotateAngle(legfrontL, 0.0F, -0.3491F, 0.0F);
        this.legfrontL.cubeList.add(new ModelBox(legfrontL, 16, 34, 0.0F, -0.5F, -3.0F, 0, 2, 3, 0.0F, true));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, 1.25F, 0.25F);
        this.bone.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.1309F, 0.1309F, -0.1309F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 0, 0.0F, -2.5F, -12.0F, 0, 3, 12, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, 1.25F, 0.25F);
        this.bone.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.1309F, -0.1309F, 0.1309F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 0, 0.0F, -2.5F, -12.0F, 0, 3, 12, 0.0F, true));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.025F, 0.75F, 0.25F);
        this.bone.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.1745F, 0.1309F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 32, 29, 0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.025F, 0.75F, 0.25F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.1745F, -0.1309F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 32, 29, 0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F, true));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(0.0F, 0.525F, 0.25F);
        this.bone.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.2618F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 28, 23, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(0.0F, 0.525F, 0.25F);
        this.bone.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.2618F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 28, 23, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F, true));

        this.armR1 = new AdvancedModelRenderer(this);
        this.armR1.setRotationPoint(-1.0F, 2.55F, 2.5F);
        this.bone.addChild(armR1);
        this.setRotateAngle(armR1, 0.0F, 0.6545F, -0.3927F);
        this.armR1.cubeList.add(new ModelBox(armR1, 12, 25, -0.75F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));
        this.armR1.cubeList.add(new ModelBox(armR1, 22, 25, -0.25F, -0.5F, -4.0F, 1, 1, 4, -0.01F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armR1.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, -0.7418F, 0.0F);
        this.armR2.cubeList.add(new ModelBox(armR2, 22, 37, -0.75F, -0.5F, -1.5F, 1, 1, 2, 0.02F, false));
        this.armR2.cubeList.add(new ModelBox(armR2, 38, 18, 0.15F, 0.0F, -0.75F, 1, 0, 1, 0.0F, false));
        this.armR2.cubeList.add(new ModelBox(armR2, 28, 37, -0.15F, -0.5F, -1.5F, 1, 1, 2, 0.01F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.0F, -0.1745F, 0.0F);
        this.armR3.cubeList.add(new ModelBox(armR3, 8, 37, -1.0F, -0.5F, -1.5F, 2, 1, 2, 0.03F, false));
        this.armR3.cubeList.add(new ModelBox(armR3, 38, 16, 0.25F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.875F, 0.5F, -3.0F);
        this.armR3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 33, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.armR3.addChild(clawR);
        this.setRotateAngle(clawR, 0.0F, -0.1745F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 38, 17, -0.25F, 0.0F, -1.1F, 1, 0, 1, 0.0F, false));
        this.clawR.cubeList.add(new ModelBox(clawR, 0, 34, -0.5F, -0.5F, -2.5F, 1, 1, 3, -0.01F, false));

        this.armL1 = new AdvancedModelRenderer(this);
        this.armL1.setRotationPoint(1.0F, 2.55F, 2.5F);
        this.bone.addChild(armL1);
        this.setRotateAngle(armL1, 0.0F, -0.6545F, 0.3927F);
        this.armL1.cubeList.add(new ModelBox(armL1, 12, 25, -0.25F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));
        this.armL1.cubeList.add(new ModelBox(armL1, 22, 25, -0.75F, -0.5F, -4.0F, 1, 1, 4, -0.01F, true));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armL1.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, 0.7418F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 22, 37, -0.25F, -0.5F, -1.5F, 1, 1, 2, 0.02F, true));
        this.armL2.cubeList.add(new ModelBox(armL2, 38, 18, -1.15F, 0.0F, -0.75F, 1, 0, 1, 0.0F, true));
        this.armL2.cubeList.add(new ModelBox(armL2, 28, 37, -0.85F, -0.5F, -1.5F, 1, 1, 2, 0.01F, true));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.0F, 0.1745F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 8, 37, -1.0F, -0.5F, -1.5F, 2, 1, 2, 0.03F, true));
        this.armL3.cubeList.add(new ModelBox(armL3, 38, 16, -1.25F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.875F, 0.5F, -3.0F);
        this.armL3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 33, -1.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, true));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.armL3.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, 0.1745F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 38, 17, -0.75F, 0.0F, -1.1F, 1, 0, 1, 0.0F, true));
        this.clawL.cubeList.add(new ModelBox(clawL, 0, 34, -0.5F, -0.5F, -2.5F, 1, 1, 3, -0.01F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-2.0F, 2.75F, 3.25F);
        this.bone.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 1.1781F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 15, 0.0F, -0.75F, -6.5F, 0, 3, 7, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(2.0F, 2.75F, 3.25F);
        this.bone.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -1.1781F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 15, 0.0F, -0.75F, -6.5F, 0, 3, 7, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, 2.75F, 4.0F);
        this.bone.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 1.3963F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 14, 15, 0.0F, -0.75F, -6.5F, 0, 3, 7, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, 2.75F, 4.0F);
        this.bone.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -1.3963F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 14, 15, 0.0F, -0.75F, -6.5F, 0, 3, 7, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, 2.75F, 4.75F);
        this.bone.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 1.7453F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 25, 0.0F, -0.75F, -5.5F, 0, 3, 6, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, 2.75F, 4.75F);
        this.bone.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -1.7453F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 25, 0.0F, -0.75F, -5.5F, 0, 3, 6, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.0F, 2.75F, 5.5F);
        this.bone.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 2.138F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 24, 7, 0.0F, -0.75F, -4.5F, 0, 3, 5, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.0F, 2.75F, 5.5F);
        this.bone.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -2.138F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 24, 7, 0.0F, -0.75F, -4.5F, 0, 3, 5, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.275F, 5.25F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, -0.0436F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 28, 15, -1.5F, -0.025F, 0.0F, 3, 2, 2, 0.0F, false));

        this.pleopodR = new AdvancedModelRenderer(this);
        this.pleopodR.setRotationPoint(-0.5F, 1.975F, 1.45F);
        this.body1.addChild(pleopodR);
        this.setRotateAngle(pleopodR, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR.cubeList.add(new ModelBox(pleopodR, 6, 38, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL = new AdvancedModelRenderer(this);
        this.pleopodL.setRotationPoint(0.5F, 1.975F, 1.45F);
        this.body1.addChild(pleopodL);
        this.setRotateAngle(pleopodL, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL.cubeList.add(new ModelBox(pleopodL, 6, 38, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 28, 19, -1.5F, -0.025F, -0.5F, 3, 2, 2, 0.01F, false));

        this.pleopodR2 = new AdvancedModelRenderer(this);
        this.pleopodR2.setRotationPoint(-0.5F, 1.975F, 0.45F);
        this.body2.addChild(pleopodR2);
        this.setRotateAngle(pleopodR2, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR2.cubeList.add(new ModelBox(pleopodR2, 38, 19, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL2 = new AdvancedModelRenderer(this);
        this.pleopodL2.setRotationPoint(0.5F, 1.975F, 0.45F);
        this.body2.addChild(pleopodL2);
        this.setRotateAngle(pleopodL2, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL2.cubeList.add(new ModelBox(pleopodL2, 38, 19, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 8, 34, -1.5F, -0.025F, 0.0F, 3, 2, 1, 0.0F, false));

        this.pleopodR3 = new AdvancedModelRenderer(this);
        this.pleopodR3.setRotationPoint(-0.5F, 1.975F, 0.35F);
        this.body3.addChild(pleopodR3);
        this.setRotateAngle(pleopodR3, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR3.cubeList.add(new ModelBox(pleopodR3, 38, 21, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL3 = new AdvancedModelRenderer(this);
        this.pleopodL3.setRotationPoint(0.5F, 1.975F, 0.35F);
        this.body3.addChild(pleopodL3);
        this.setRotateAngle(pleopodL3, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL3.cubeList.add(new ModelBox(pleopodL3, 38, 21, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.1309F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 34, 10, -1.5F, -0.025F, 0.0F, 3, 2, 1, 0.01F, false));

        this.pleopodR4 = new AdvancedModelRenderer(this);
        this.pleopodR4.setRotationPoint(-0.5F, 1.975F, 0.6F);
        this.body4.addChild(pleopodR4);
        this.setRotateAngle(pleopodR4, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR4.cubeList.add(new ModelBox(pleopodR4, 38, 34, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL4 = new AdvancedModelRenderer(this);
        this.pleopodL4.setRotationPoint(0.5F, 1.975F, 0.6F);
        this.body4.addChild(pleopodL4);
        this.setRotateAngle(pleopodL4, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL4.cubeList.add(new ModelBox(pleopodL4, 38, 34, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body6);
        this.setRotateAngle(body6, -0.1309F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 30, 34, -1.5F, -0.025F, 0.0F, 3, 2, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 34, 37, -1.0F, -0.025F, 1.0F, 2, 1, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 38, 15, -1.325F, 0.125F, 0.75F, 1, 0, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 38, 15, 0.325F, 0.125F, 0.75F, 1, 0, 1, 0.0F, true));
        this.body6.cubeList.add(new ModelBox(body6, 22, 30, -1.0F, 0.175F, 1.5F, 2, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.8F, 0.2F, 1.6F);
        this.body6.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 26, -2.0F, 0.075F, -0.5F, 2, 0, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.4F, 0.15F, 1.9F);
        this.body6.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 23, -2.0F, 0.075F, -0.5F, 2, 0, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.8F, 0.2F, 1.6F);
        this.body6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, -0.5672F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 26, 0.0F, 0.075F, -0.5F, 2, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.4F, 0.15F, 1.9F);
        this.body6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, -0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 23, 0.0F, 0.075F, -0.5F, 2, 0, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bone.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.bone.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.bone.offsetZ = 0.030F;
        this.bone.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -1.F;
        this.bone.offsetX = 0.2F;
        this.bone.rotateAngleY = (float)Math.toRadians(220);
        this.bone.rotateAngleX = (float)Math.toRadians(8);
        this.bone.rotateAngleZ = (float)Math.toRadians(-8);
        this.bone.scaleChildren = true;
        float scaler = 3.0F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
       // this.body.offsetY = 0.4F;
        //this.carapace.offsetY = -0.2F;
        //this.carapace.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.body1, this.body2, this.body3, this.body4, this.body6};
        AdvancedModelRenderer[] fishTail = {this.body4, this.body6};



        //mouthparts:
        //this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        //this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraPalaeoechinastacus slimon = (EntityPrehistoricFloraPalaeoechinastacus) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 0.2F;
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPalaeoechinastacus ee = (EntityPrehistoricFloraPalaeoechinastacus) entitylivingbaseIn;
        //Swimming pose:

        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                //Walk pose:
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    //Walk static pose:
                    animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
        }
    }
    

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPalaeoechinastacus entity = (EntityPrehistoricFloraPalaeoechinastacus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-0))*2), bone.rotateAngleY + (float) Math.toRadians(0), bone.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-90))*2));
        this.bone.rotationPointX = this.bone.rotationPointX + (float)(0);
        this.bone.rotationPointY = this.bone.rotationPointY - (float)(0.85);
        this.bone.rotationPointZ = this.bone.rotationPointZ + (float)(0);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(7.5), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(10), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaR2, antennaR2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*2.5), antennaR2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+125))*2.5), antennaR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaR, antennaR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*5), antennaR.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaR.rotateAngleZ + (float) Math.toRadians(0));



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



        this.setRotateAngle(legfrontR, legfrontR.rotateAngleX + (float) Math.toRadians(-31.16153), legfrontR.rotateAngleY + (float) Math.toRadians(-36.65615), legfrontR.rotateAngleZ + (float) Math.toRadians(-4.904));


        this.setRotateAngle(pleopodR, pleopodR.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), pleopodR.rotateAngleY + (float) Math.toRadians(0), pleopodR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodR2, pleopodR2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*20), pleopodR2.rotateAngleY + (float) Math.toRadians(0), pleopodR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodR3, pleopodR3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), pleopodR3.rotateAngleY + (float) Math.toRadians(0), pleopodR3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pleopodR4, pleopodR4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*20), pleopodR4.rotateAngleY + (float) Math.toRadians(0), pleopodR4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaL, antennaL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*5), antennaL.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaL2, antennaL2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*2.5), antennaL2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+45))*2.5), antennaL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legfrontL, legfrontL.rotateAngleX + (float) Math.toRadians(-31.16153), legfrontL.rotateAngleY + (float) Math.toRadians(36.65615), legfrontL.rotateAngleZ + (float) Math.toRadians(4.904));



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
        this.setRotateAngle(pleopodL, pleopodL.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), pleopodL.rotateAngleY + (float) Math.toRadians(0), pleopodL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodL2, pleopodL2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*20), pleopodL2.rotateAngleY + (float) Math.toRadians(0), pleopodL2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodL3, pleopodL3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), pleopodL3.rotateAngleY + (float) Math.toRadians(0), pleopodL3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodL4, pleopodL4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*20), pleopodL4.rotateAngleY + (float) Math.toRadians(0), pleopodL4.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPalaeoechinastacus entity = (EntityPrehistoricFloraPalaeoechinastacus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(-10.5), bone.rotateAngleY + (float) Math.toRadians(0), bone.rotateAngleZ + (float) Math.toRadians(0));
        this.bone.rotationPointX = this.bone.rotationPointX + (float)(0);
        this.bone.rotationPointY = this.bone.rotationPointY - (float)(-0.1);
        this.bone.rotationPointZ = this.bone.rotationPointZ + (float)(0);
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(7.5), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(10), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(-2.5), body4.rotateAngleY + (float) Math.toRadians(0), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(antennaR2, antennaR2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*2.5), antennaR2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+125))*2.5), antennaR2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(antennaR, antennaR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*5), antennaR.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(-30.79813), legR.rotateAngleY + (float) Math.toRadians(-14.89089), legR.rotateAngleZ + (float) Math.toRadians(-40.34924));
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(-5.3183), legR2.rotateAngleY + (float) Math.toRadians(-4.91613), legR2.rotateAngleZ + (float) Math.toRadians(-0.73261));
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(121.25402), legR3.rotateAngleY + (float) Math.toRadians(-44.20104), legR3.rotateAngleZ + (float) Math.toRadians(129.17738));
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(134.35289), legR4.rotateAngleY + (float) Math.toRadians(-101.22608), legR4.rotateAngleZ + (float) Math.toRadians(127.53289));
        this.setRotateAngle(legfrontR, legfrontR.rotateAngleX + (float) Math.toRadians(-31.16153), legfrontR.rotateAngleY + (float) Math.toRadians(-36.65615), legfrontR.rotateAngleZ + (float) Math.toRadians(-4.904));
        this.setRotateAngle(pleopodR, pleopodR.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), pleopodR.rotateAngleY + (float) Math.toRadians(0), pleopodR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodR2, pleopodR2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*20), pleopodR2.rotateAngleY + (float) Math.toRadians(0), pleopodR2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodR3, pleopodR3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), pleopodR3.rotateAngleY + (float) Math.toRadians(0), pleopodR3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodR4, pleopodR4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*20), pleopodR4.rotateAngleY + (float) Math.toRadians(0), pleopodR4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(antennaL, antennaL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*5), antennaL.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(antennaL2, antennaL2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*2.5), antennaL2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+45))*2.5), antennaL2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legfrontL, legfrontL.rotateAngleX + (float) Math.toRadians(-31.16153), legfrontL.rotateAngleY + (float) Math.toRadians(36.65615), legfrontL.rotateAngleZ + (float) Math.toRadians(4.904));
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(-30.79813), legL.rotateAngleY + (float) Math.toRadians(14.89089), legL.rotateAngleZ + (float) Math.toRadians(40.34924));
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(-5.3183), legL2.rotateAngleY + (float) Math.toRadians(4.91613), legL2.rotateAngleZ + (float) Math.toRadians(0.73261));
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(121.25402), legL3.rotateAngleY + (float) Math.toRadians(44.20104), legL3.rotateAngleZ + (float) Math.toRadians(-129.17738));
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(134.35289), legL4.rotateAngleY + (float) Math.toRadians(101.22608), legL4.rotateAngleZ + (float) Math.toRadians(-127.53289));
        this.setRotateAngle(pleopodL, pleopodL.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), pleopodL.rotateAngleY + (float) Math.toRadians(0), pleopodL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodL2, pleopodL2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*20), pleopodL2.rotateAngleY + (float) Math.toRadians(0), pleopodL2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodL3, pleopodL3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), pleopodL3.rotateAngleY + (float) Math.toRadians(0), pleopodL3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pleopodL4, pleopodL4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*20), pleopodL4.rotateAngleY + (float) Math.toRadians(0), pleopodL4.rotateAngleZ + (float) Math.toRadians(0));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPalaeoechinastacus e = (EntityPrehistoricFloraPalaeoechinastacus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
