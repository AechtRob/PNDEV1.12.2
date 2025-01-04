package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCoeruleodraco;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCoeruleodraco extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer forehead2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer lips;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer lipsl;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lipsr;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer lipsjawl;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer lipsjawr;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;

    private ModelAnimator animator;

    public ModelCoeruleodraco() {
        this.textureWidth = 55;
        this.textureHeight = 46;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 21.0F, 0.0F);


        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Root.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 34, 20, -2.5F, -2.0F, -3.0F, 5, 4, 5, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.25F, -3.0F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 35, -2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -1.25F, -2.0F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.0873F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 36, -2.0F, -1.0F, -4.0F, 4, 3, 4, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 7, -1.5F, -0.75F, 0.0F, 3, 1, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -3.75F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 14, 27, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 32, 42, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 12, 36, -1.5F, -0.75F, -2.0F, 3, 1, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1068F, -0.2648F, 0.3622F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 0, 0.0F, -0.75F, -0.5F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1068F, 0.2648F, -0.3622F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 0, -1.0F, -0.75F, -0.5F, 1, 1, 2, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.Head.addChild(forehead);
        this.setRotateAngle(forehead, 0.0873F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 15, 4, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.001F, false));

        this.forehead2 = new AdvancedModelRenderer(this);
        this.forehead2.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.forehead.addChild(forehead2);
        this.forehead2.cubeList.add(new ModelBox(forehead2, 0, 0, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.forehead2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1065F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 18, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.lips = new AdvancedModelRenderer(this);
        this.lips.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Head.addChild(lips);
        this.setRotateAngle(lips, -0.0654F, 0.0F, 0.0F);
        this.lips.cubeList.add(new ModelBox(lips, 0, 14, -0.5F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -3.975F);
        this.lips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0049F, 0.2618F, 0.0024F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.25F, -0.7F, 0.5F, 0, 1, 5, -0.001F, false));

        this.lipsl = new AdvancedModelRenderer(this);
        this.lipsl.setRotationPoint(0.5F, 0.0F, -4.0F);
        this.lips.addChild(lipsl);
        this.setRotateAngle(lipsl, 0.0F, 0.3054F, 0.0009F);
        this.lipsl.cubeList.add(new ModelBox(lipsl, 0, 0, -1.0F, -0.999F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.lipsl.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0355F, -0.1743F, -0.0084F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 27, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.lipsr = new AdvancedModelRenderer(this);
        this.lipsr.setRotationPoint(-0.5F, 0.0F, -4.0F);
        this.lips.addChild(lipsr);
        this.setRotateAngle(lipsr, 0.0F, -0.3054F, -0.0009F);
        this.lipsr.cubeList.add(new ModelBox(lipsr, 0, 0, 0.0F, -0.999F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.lipsr.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0355F, 0.1743F, 0.0084F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 27, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.025F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0873F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 24, 41, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 27, 11, -0.5F, 0.0F, -7.0F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -1.25F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 23, -1.5F, -1.0F, 0.0F, 3, 1, 1, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.0F, -7.0F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2618F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 0, -0.275F, -0.25F, 1.5F, 0, 1, 3, -0.001F, false));

        this.lipsjawl = new AdvancedModelRenderer(this);
        this.lipsjawl.setRotationPoint(0.5F, 0.0F, -7.0F);
        this.Jaw.addChild(lipsjawl);
        this.setRotateAngle(lipsjawl, 0.0F, 0.2793F, -0.0009F);
        this.lipsjawl.cubeList.add(new ModelBox(lipsjawl, 0, 6, -1.0F, -0.001F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.lipsjawl.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1353F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 14, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.lipsjawr = new AdvancedModelRenderer(this);
        this.lipsjawr.setRotationPoint(-0.5F, 0.0F, -7.0F);
        this.Jaw.addChild(lipsjawr);
        this.setRotateAngle(lipsjawr, 0.0F, -0.2793F, 0.0009F);
        this.lipsjawr.cubeList.add(new ModelBox(lipsjawr, 0, 6, 0.0F, -0.001F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.lipsjawr.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1353F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 14, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.5F, 1.0F);
        this.Chest.addChild(Body);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 18, 25, -2.5F, -1.5F, 0.0F, 5, 4, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.5F, 7.0F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0227F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 0, -2.0F, 0.0F, -7.0F, 4, 1, 6, -0.001F, false));

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body.addChild(Hips);
        this.setRotateAngle(Hips, -0.0436F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 15, 0, -2.0F, -1.5F, 0.0F, 4, 4, 7, -0.001F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Hips.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 13, 14, -1.5F, -1.0F, 0.0F, 3, 3, 8, -0.001F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 27, 11, -1.5F, -1.25F, 0.0F, 3, 1, 8, -0.002F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 27, -1.5F, 1.25F, 0.0F, 3, 1, 8, -0.002F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 0, -1.0F, -1.5F, 0.0F, 2, 3, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 10.5F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 14, -0.5F, -1.0F, -0.5F, 1, 2, 11, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 10.5F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 33, 29, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(1.5F, 1.0F, 4.5F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0297F, 0.9686F, 0.2293F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 35, 37, 0.0F, -1.0F, -1.5F, 5, 2, 3, 0.0F, false));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(5.0F, 0.0F, -1.0F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.9803F, -1.4136F, 0.986F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 14, 41, 0.0F, -0.5F, -0.5F, 5, 1, 2, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(4.5F, 0.0F, 0.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.5518F, 1.4297F, -0.9376F);
        this.FootL.cubeList.add(new ModelBox(FootL, 41, 12, 0.0F, -0.5F, -1.5F, 4, 1, 3, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-1.5F, 1.0F, 4.5F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.0297F, -0.9686F, -0.2293F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 35, 37, -5.0F, -1.0F, -1.5F, 5, 2, 3, 0.0F, true));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-5.0F, 0.0F, -1.0F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, -0.9803F, 1.4136F, -0.986F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 14, 41, -5.0F, -0.5F, -0.5F, 5, 1, 2, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(-4.5F, 0.0F, 0.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.5518F, -1.4297F, 0.9376F);
        this.FootR.cubeList.add(new ModelBox(FootR, 41, 12, -4.0F, -0.5F, -1.5F, 4, 1, 3, 0.0F, true));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(2.0F, 1.0F, -2.0F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.0547F, -1.0551F, 0.2637F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 0, 19, 0.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(3.0F, 0.0F, 0.5F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 2.0375F, 1.3759F, 2.0299F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 41, 16, 0.0F, -0.5F, -1.5F, 4, 1, 2, 0.0F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(3.5F, 0.0F, -0.5F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.1805F, 0.9234F, -0.2164F);
        this.HandL.cubeList.add(new ModelBox(HandL, 42, 29, 0.0F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-2.0F, 1.0F, -2.0F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.0547F, 1.0551F, -0.2637F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 0, 19, -3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-3.0F, 0.0F, 0.5F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 2.0375F, -1.3759F, -2.0299F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 41, 16, -4.0F, -0.5F, -1.5F, 4, 1, 2, 0.0F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-3.5F, 0.0F, -0.5F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.1805F, -0.9234F, 0.2164F);
        this.HandR.cubeList.add(new ModelBox(HandR, 42, 29, -3.0F, -0.5F, -1.5F, 3, 1, 3, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -2.0F;
        this.Root.offsetX = -1.338F;
        this.Root.rotateAngleY = (float)Math.toRadians(200);
        this.Root.rotateAngleX = (float)Math.toRadians(8);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 1.63F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        this.Root.offsetY = 0.0F;

        EntityPrehistoricFloraCoeruleodraco proteros = (EntityPrehistoricFloraCoeruleodraco) e;

        this.faceTarget(f3, f4, 10, Neck);
        this.faceTarget(f3, f4, 10, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCoeruleodraco ee = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCoeruleodraco entity = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (4.12595-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (35.34549-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-25.34649-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 4.12595 + (((tickAnim - 6) / 7) * (0-(4.12595)));
            yy = 35.34549 + (((tickAnim - 6) / 7) * (54.25-(35.34549)));
            zz = -25.34649 + (((tickAnim - 6) / 7) * (0-(-25.34649)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (38.41855-(0)));
            yy = 54.25 + (((tickAnim - 13) / 4) * (17.95906-(54.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (-50.10958-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 38.41855 + (((tickAnim - 17) / 3) * (25.40876-(38.41855)));
            yy = 17.95906 + (((tickAnim - 17) / 3) * (-3.20273-(17.95906)));
            zz = -50.10958 + (((tickAnim - 17) / 3) * (-20.5982-(-50.10958)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.40876 + (((tickAnim - 20) / 5) * (4.12595-(25.40876)));
            yy = -3.20273 + (((tickAnim - 20) / 5) * (35.34549-(-3.20273)));
            zz = -20.5982 + (((tickAnim - 20) / 5) * (-25.34649-(-20.5982)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.12595 + (((tickAnim - 25) / 5) * (0-(4.12595)));
            yy = 35.34549 + (((tickAnim - 25) / 5) * (54.25-(35.34549)));
            zz = -25.34649 + (((tickAnim - 25) / 5) * (0-(-25.34649)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (38.41855-(0)));
            yy = 54.25 + (((tickAnim - 30) / 4) * (17.95906-(54.25)));
            zz = 0 + (((tickAnim - 30) / 4) * (-50.10958-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 38.41855 + (((tickAnim - 34) / 4) * (25.40876-(38.41855)));
            yy = 17.95906 + (((tickAnim - 34) / 4) * (-3.20273-(17.95906)));
            zz = -50.10958 + (((tickAnim - 34) / 4) * (-20.5982-(-50.10958)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 25.40876 + (((tickAnim - 38) / 5) * (4.12595-(25.40876)));
            yy = -3.20273 + (((tickAnim - 38) / 5) * (35.34549-(-3.20273)));
            zz = -20.5982 + (((tickAnim - 38) / 5) * (-25.34649-(-20.5982)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 4.12595 + (((tickAnim - 43) / 7) * (0-(4.12595)));
            yy = 35.34549 + (((tickAnim - 43) / 7) * (0-(35.34549)));
            zz = -25.34649 + (((tickAnim - 43) / 7) * (0-(-25.34649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-69.02111-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (-30.04313-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-105.42746-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -69.02111 + (((tickAnim - 20) / 5) * (0-(-69.02111)));
            yy = -30.04313 + (((tickAnim - 20) / 5) * (0-(-30.04313)));
            zz = -105.42746 + (((tickAnim - 20) / 5) * (0-(-105.42746)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (-69.02111-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (-30.04313-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (-105.42746-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -69.02111 + (((tickAnim - 38) / 5) * (0-(-69.02111)));
            yy = -30.04313 + (((tickAnim - 38) / 5) * (0-(-30.04313)));
            zz = -105.42746 + (((tickAnim - 38) / 5) * (0-(-105.42746)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.29291-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-51.98299-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.34553-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0.29291 + (((tickAnim - 13) / 17) * (0.29291-(0.29291)));
            yy = -51.98299 + (((tickAnim - 13) / 17) * (-51.98299-(-51.98299)));
            zz = 9.34553 + (((tickAnim - 13) / 17) * (9.34553-(9.34553)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0.29291 + (((tickAnim - 30) / 13) * (0.29291-(0.29291)));
            yy = -51.98299 + (((tickAnim - 30) / 13) * (-51.98299-(-51.98299)));
            zz = 9.34553 + (((tickAnim - 30) / 13) * (9.34553-(9.34553)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0.29291 + (((tickAnim - 43) / 7) * (0-(0.29291)));
            yy = -51.98299 + (((tickAnim - 43) / 7) * (0-(-51.98299)));
            zz = 9.34553 + (((tickAnim - 43) / 7) * (0-(9.34553)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCoeruleodraco entity = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 15) / 20) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 15) / 20) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 35) / 15) * (0-(6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 15) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 35) / 15) * (0-(2.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.75 + (((tickAnim - 15) / 20) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 35) / 15) * (0-(2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12 + (((tickAnim - 15) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 35) / 15) * (0-(12)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 15) / 20) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 35) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12 + (((tickAnim - 15) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 35) / 15) * (0-(12)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 15) / 20) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 35) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCoeruleodraco entity = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 5) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.75 + (((tickAnim - 5) / 5) * (17.5-(9.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 10) / 3) * (0-(17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 13.25 + (((tickAnim - 5) / 3) * (0-(13.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCoeruleodraco entity = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 11.25 + (((tickAnim - 3) / 4) * (-8.25-(11.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -8.25 + (((tickAnim - 7) / 3) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -13.25 + (((tickAnim - 3) / 4) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0.25 + (((tickAnim - 3) / 7) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 3) / 4) * (34.25-(6.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 34.25 + (((tickAnim - 7) / 1) * (0-(34.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCoeruleodraco entity = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -7.77526 + (((tickAnim - 0) / 6) * (-10.34743-(-7.77526)));
            yy = -78.1251 + (((tickAnim - 0) / 6) * (-39.26342-(-78.1251)));
            zz = -10.66852 + (((tickAnim - 0) / 6) * (-26.74176-(-10.66852)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -10.34743 + (((tickAnim - 6) / 5) * (0-(-10.34743)));
            yy = -39.26342 + (((tickAnim - 6) / 5) * (0-(-39.26342)));
            zz = -26.74176 + (((tickAnim - 6) / 5) * (0-(-26.74176)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 11) / 15) * (-7.77526-(0)));
            yy = 0 + (((tickAnim - 11) / 15) * (-78.1251-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (-10.66852-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 109.6747 + (((tickAnim - 0) / 6) * (54.71051-(109.6747)));
            yy = 3.01991 + (((tickAnim - 0) / 6) * (34.35539-(3.01991)));
            zz = -96.87489 + (((tickAnim - 0) / 6) * (-49.10978-(-96.87489)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 54.71051 + (((tickAnim - 6) / 5) * (0-(54.71051)));
            yy = 34.35539 + (((tickAnim - 6) / 5) * (0-(34.35539)));
            zz = -49.10978 + (((tickAnim - 6) / 5) * (0-(-49.10978)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 11) / 15) * (109.6747-(0)));
            yy = 0 + (((tickAnim - 11) / 15) * (3.01991-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (-96.87489-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 96.70356 + (((tickAnim - 0) / 6) * (44.20857-(96.70356)));
            yy = -42.92783 + (((tickAnim - 0) / 6) * (-50.24087-(-42.92783)));
            zz = 63.48896 + (((tickAnim - 0) / 6) * (44.04823-(63.48896)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 44.20857 + (((tickAnim - 6) / 2) * (0-(44.20857)));
            yy = -50.24087 + (((tickAnim - 6) / 2) * (0-(-50.24087)));
            zz = 44.04823 + (((tickAnim - 6) / 2) * (0-(44.04823)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-145.27947-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-5.4462-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-144.1822-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -145.27947 + (((tickAnim - 11) / 5) * (46.64887-(-145.27947)));
            yy = -5.4462 + (((tickAnim - 11) / 5) * (-0.42391-(-5.4462)));
            zz = -144.1822 + (((tickAnim - 11) / 5) * (35.29167-(-144.1822)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 46.64887 + (((tickAnim - 16) / 10) * (96.70356-(46.64887)));
            yy = -0.42391 + (((tickAnim - 16) / 10) * (-42.92783-(-0.42391)));
            zz = 35.29167 + (((tickAnim - 16) / 10) * (63.48896-(35.29167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -145.27947 + (((tickAnim - 0) / 5) * (94.41298-(-145.27947)));
            yy = 5.44619 + (((tickAnim - 0) / 5) * (-4.18125-(5.44619)));
            zz = 144.18223 + (((tickAnim - 0) / 5) * (-83.13378-(144.18223)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 94.41298 + (((tickAnim - 5) / 8) * (96.70356-(94.41298)));
            yy = -4.18125 + (((tickAnim - 5) / 8) * (42.9278-(-4.18125)));
            zz = -83.13378 + (((tickAnim - 5) / 8) * (-63.489-(-83.13378)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 96.70356 + (((tickAnim - 13) / 7) * (62.58207-(96.70356)));
            yy = 42.9278 + (((tickAnim - 13) / 7) * (24.95856-(42.9278)));
            zz = -63.489 + (((tickAnim - 13) / 7) * (-28.05342-(-63.489)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 62.58207 + (((tickAnim - 20) / 6) * (-145.27947-(62.58207)));
            yy = 24.95856 + (((tickAnim - 20) / 6) * (5.44619-(24.95856)));
            zz = -28.05342 + (((tickAnim - 20) / 6) * (144.18223-(-28.05342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (42.2047-(0)));
            yy = 78.75 + (((tickAnim - 0) / 13) * (3.791-(78.75)));
            zz = 0 + (((tickAnim - 0) / 13) * (-47.6444-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 42.2047 + (((tickAnim - 13) / 7) * (23.82258-(42.2047)));
            yy = 3.791 + (((tickAnim - 13) / 7) * (49.40125-(3.791)));
            zz = -47.6444 + (((tickAnim - 13) / 7) * (-39.31224-(-47.6444)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 23.82258 + (((tickAnim - 20) / 6) * (0-(23.82258)));
            yy = 49.40125 + (((tickAnim - 20) / 6) * (78.75-(49.40125)));
            zz = -39.31224 + (((tickAnim - 20) / 6) * (0-(-39.31224)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -77.86414 + (((tickAnim - 0) / 13) * (-77.26001-(-77.86414)));
            yy = -13.05405 + (((tickAnim - 0) / 13) * (-30.0169-(-13.05405)));
            zz = -81.34881 + (((tickAnim - 0) / 13) * (-106.3535-(-81.34881)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -77.26001 + (((tickAnim - 13) / 7) * (-130.21459-(-77.26001)));
            yy = -30.0169 + (((tickAnim - 13) / 7) * (-17.29352-(-30.0169)));
            zz = -106.3535 + (((tickAnim - 13) / 7) * (-122.22695-(-106.3535)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -130.21459 + (((tickAnim - 20) / 6) * (-77.86414-(-130.21459)));
            yy = -17.29352 + (((tickAnim - 20) / 6) * (-13.05405-(-17.29352)));
            zz = -122.22695 + (((tickAnim - 20) / 6) * (-81.34881-(-122.22695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-33.50138-(0)));
            yy = -50.75 + (((tickAnim - 0) / 5) * (-27.623-(-50.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-16.17-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -33.50138 + (((tickAnim - 5) / 8) * (14.504-(-33.50138)));
            yy = -27.623 + (((tickAnim - 5) / 8) * (-20.1485-(-27.623)));
            zz = -16.17 + (((tickAnim - 5) / 8) * (52.8832-(-16.17)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 14.504 + (((tickAnim - 13) / 7) * (10.9585-(14.504)));
            yy = -20.1485 + (((tickAnim - 13) / 7) * (-42.60628-(-20.1485)));
            zz = 52.8832 + (((tickAnim - 13) / 7) * (42.63152-(52.8832)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 10.9585 + (((tickAnim - 20) / 6) * (0-(10.9585)));
            yy = -42.60628 + (((tickAnim - 20) / 6) * (-50.75-(-42.60628)));
            zz = 42.63152 + (((tickAnim - 20) / 6) * (0-(42.63152)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 42.2047 + (((tickAnim - 0) / 5) * (52.45823-(42.2047)));
            yy = -3.79103 + (((tickAnim - 0) / 5) * (-40.62978-(-3.79103)));
            zz = 47.64443 + (((tickAnim - 0) / 5) * (40.85134-(47.64443)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 52.45823 + (((tickAnim - 5) / 8) * (0-(52.45823)));
            yy = -40.62978 + (((tickAnim - 5) / 8) * (-78.75-(-40.62978)));
            zz = 40.85134 + (((tickAnim - 5) / 8) * (0-(40.85134)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (42.2047-(0)));
            yy = -78.75 + (((tickAnim - 13) / 13) * (-3.79103-(-78.75)));
            zz = 0 + (((tickAnim - 13) / 13) * (47.64443-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -77.26001 + (((tickAnim - 0) / 5) * (-135.3049-(-77.26001)));
            yy = 30.01689 + (((tickAnim - 0) / 5) * (34.6861-(30.01689)));
            zz = 106.35348 + (((tickAnim - 0) / 5) * (135.0672-(106.35348)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -135.3049 + (((tickAnim - 5) / 8) * (-77.86414-(-135.3049)));
            yy = 34.6861 + (((tickAnim - 5) / 8) * (13.0541-(34.6861)));
            zz = 135.0672 + (((tickAnim - 5) / 8) * (81.3488-(135.0672)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -77.86414 + (((tickAnim - 13) / 13) * (-77.26001-(-77.86414)));
            yy = 13.0541 + (((tickAnim - 13) / 13) * (30.01689-(13.0541)));
            zz = 81.3488 + (((tickAnim - 13) / 13) * (106.35348-(81.3488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.504 + (((tickAnim - 0) / 5) * (13.07008-(14.504)));
            yy = 20.14847 + (((tickAnim - 0) / 5) * (45.16642-(20.14847)));
            zz = -52.88318 + (((tickAnim - 0) / 5) * (-52.5757-(-52.88318)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.07008 + (((tickAnim - 5) / 5) * (-24.89367-(13.07008)));
            yy = 45.16642 + (((tickAnim - 5) / 5) * (44.06302-(45.16642)));
            zz = -52.5757 + (((tickAnim - 5) / 5) * (28.52385-(-52.5757)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -24.89367 + (((tickAnim - 10) / 3) * (0-(-24.89367)));
            yy = 44.06302 + (((tickAnim - 10) / 3) * (50.75-(44.06302)));
            zz = 28.52385 + (((tickAnim - 10) / 3) * (0-(28.52385)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-33.50138-(0)));
            yy = 50.75 + (((tickAnim - 13) / 5) * (27.62304-(50.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (16.17005-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -33.50138 + (((tickAnim - 18) / 8) * (14.504-(-33.50138)));
            yy = 27.62304 + (((tickAnim - 18) / 8) * (20.14847-(27.62304)));
            zz = 16.17005 + (((tickAnim - 18) / 8) * (-52.88318-(16.17005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.77526-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (78.1251-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (10.6685-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7.77526 + (((tickAnim - 13) / 7) * (-10.70867-(-7.77526)));
            yy = 78.1251 + (((tickAnim - 13) / 7) * (40.01833-(78.1251)));
            zz = 10.6685 + (((tickAnim - 13) / 7) * (28.52724-(10.6685)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -10.70867 + (((tickAnim - 20) / 6) * (0-(-10.70867)));
            yy = 40.01833 + (((tickAnim - 20) / 6) * (0-(40.01833)));
            zz = 28.52724 + (((tickAnim - 20) / 6) * (0-(28.52724)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (109.6747-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-3.0199-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (96.8749-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 109.6747 + (((tickAnim - 13) / 13) * (0-(109.6747)));
            yy = -3.0199 + (((tickAnim - 13) / 13) * (0-(-3.0199)));
            zz = 96.8749 + (((tickAnim - 13) / 13) * (0-(96.8749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-20))*4), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-50))*1));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279))*-0.15);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-50))*-4), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-50))*1));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-100))*-4), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-100))*1));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-200))*4), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-150))*1));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-50))*2), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-150))*1));
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-80))*3), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-100))*1));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(-1.25), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-150))*3), Tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-100))*1));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-1.5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-200))*4), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-100))*1));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0.5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-250))*6), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-100))*1));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-300))*9), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*279-100))*1));


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCoeruleodraco entity = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*15), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*1));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-0.8);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-10), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*1));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(1.75), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-8), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*8), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*1));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*1));
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*5), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*15), Tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*20), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*30), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*55), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1));
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(45.93942), UpperLegL.rotateAngleY + (float) Math.toRadians(-112.07996), UpperLegL.rotateAngleZ + (float) Math.toRadians(15.4895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*5));
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(70.51238), LowerLegL.rotateAngleY + (float) Math.toRadians(41.56783), LowerLegL.rotateAngleZ + (float) Math.toRadians(-25.57932));
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(16.75741), FootL.rotateAngleY + (float) Math.toRadians(-46.59727), FootL.rotateAngleZ + (float) Math.toRadians(33.84493));
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(49.91408), UpperLegR.rotateAngleY + (float) Math.toRadians(109.18883), UpperLegR.rotateAngleZ + (float) Math.toRadians(-10.6479+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-5));
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(70.51238), LowerLegR.rotateAngleY + (float) Math.toRadians(-41.5678), LowerLegR.rotateAngleZ + (float) Math.toRadians(25.5793));
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(16.75741), FootR.rotateAngleY + (float) Math.toRadians(46.5973), FootR.rotateAngleZ + (float) Math.toRadians(-33.8449));
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(96.82434), UpperArmL.rotateAngleY + (float) Math.toRadians(-3.71229), UpperArmL.rotateAngleZ + (float) Math.toRadians(-35.6757+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-5));
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(-101.85915), LowerArmL.rotateAngleY + (float) Math.toRadians(-60.2817), LowerArmL.rotateAngleZ + (float) Math.toRadians(-103.6738));
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(0.44405), HandL.rotateAngleY + (float) Math.toRadians(-41.79205), HandL.rotateAngleZ + (float) Math.toRadians(37.36197));
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(96.82434), UpperArmR.rotateAngleY + (float) Math.toRadians(3.7123), UpperArmR.rotateAngleZ + (float) Math.toRadians(35.6757+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*5));
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(-101.85915), LowerArmR.rotateAngleY + (float) Math.toRadians(60.2817), LowerArmR.rotateAngleZ + (float) Math.toRadians(103.6738));
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(0.44405), HandR.rotateAngleY + (float) Math.toRadians(41.792), HandR.rotateAngleZ + (float) Math.toRadians(-37.362));


    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCoeruleodraco entity = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*7), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.25);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-7), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(1.75), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-4), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*4), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1));
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*8), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*8), Tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*18), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*25), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1));
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(39.17153), UpperLegL.rotateAngleY + (float) Math.toRadians(-115.68564), UpperLegL.rotateAngleZ + (float) Math.toRadians(23.429+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5));
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(70.51238), LowerLegL.rotateAngleY + (float) Math.toRadians(41.56783), LowerLegL.rotateAngleZ + (float) Math.toRadians(-25.57932));
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(16.75741), FootL.rotateAngleY + (float) Math.toRadians(-46.59727), FootL.rotateAngleZ + (float) Math.toRadians(33.84493));
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(38.82319), UpperLegR.rotateAngleY + (float) Math.toRadians(115.83659), UpperLegR.rotateAngleZ + (float) Math.toRadians(-23.83+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(70.51238), LowerLegR.rotateAngleY + (float) Math.toRadians(-41.5678), LowerLegR.rotateAngleZ + (float) Math.toRadians(25.5793));
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(16.75741), FootR.rotateAngleY + (float) Math.toRadians(46.5973), FootR.rotateAngleZ + (float) Math.toRadians(-33.8449));
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(96.82434), UpperArmL.rotateAngleY + (float) Math.toRadians(-3.71229), UpperArmL.rotateAngleZ + (float) Math.toRadians(-35.6757+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(-101.85915), LowerArmL.rotateAngleY + (float) Math.toRadians(-60.2817), LowerArmL.rotateAngleZ + (float) Math.toRadians(-103.6738));
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(0.44405), HandL.rotateAngleY + (float) Math.toRadians(-41.79205), HandL.rotateAngleZ + (float) Math.toRadians(37.36197));
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(96.82434), UpperArmR.rotateAngleY + (float) Math.toRadians(3.7123), UpperArmR.rotateAngleZ + (float) Math.toRadians(35.6757+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5));
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(-101.85915), LowerArmR.rotateAngleY + (float) Math.toRadians(60.2817), LowerArmR.rotateAngleZ + (float) Math.toRadians(103.6738));
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(0.44405), HandR.rotateAngleY + (float) Math.toRadians(41.792), HandR.rotateAngleZ + (float) Math.toRadians(-37.362));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCoeruleodraco entity = (EntityPrehistoricFloraCoeruleodraco) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.77526 + (((tickAnim - 0) / 3) * (-10.34743-(-7.77526)));
            yy = -78.1251 + (((tickAnim - 0) / 3) * (-39.26342-(-78.1251)));
            zz = -10.66852 + (((tickAnim - 0) / 3) * (-26.74176-(-10.66852)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10.34743 + (((tickAnim - 3) / 3) * (0-(-10.34743)));
            yy = -39.26342 + (((tickAnim - 3) / 3) * (0-(-39.26342)));
            zz = -26.74176 + (((tickAnim - 3) / 3) * (0-(-26.74176)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-7.77526-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-78.1251-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-10.66852-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 109.6747 + (((tickAnim - 0) / 3) * (54.71051-(109.6747)));
            yy = 3.01991 + (((tickAnim - 0) / 3) * (34.35539-(3.01991)));
            zz = -96.87489 + (((tickAnim - 0) / 3) * (-49.10978-(-96.87489)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 54.71051 + (((tickAnim - 3) / 3) * (0-(54.71051)));
            yy = 34.35539 + (((tickAnim - 3) / 3) * (0-(34.35539)));
            zz = -49.10978 + (((tickAnim - 3) / 3) * (0-(-49.10978)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (109.6747-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (3.01991-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-96.87489-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 96.70356 + (((tickAnim - 0) / 3) * (44.20857-(96.70356)));
            yy = -42.92783 + (((tickAnim - 0) / 3) * (-50.24087-(-42.92783)));
            zz = 63.48896 + (((tickAnim - 0) / 3) * (44.04823-(63.48896)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 44.20857 + (((tickAnim - 3) / 1) * (0-(44.20857)));
            yy = -50.24087 + (((tickAnim - 3) / 1) * (0-(-50.24087)));
            zz = 44.04823 + (((tickAnim - 3) / 1) * (0-(44.04823)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-145.27947-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (-5.4462-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-144.1822-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -145.27947 + (((tickAnim - 6) / 2) * (46.64887-(-145.27947)));
            yy = -5.4462 + (((tickAnim - 6) / 2) * (-0.42391-(-5.4462)));
            zz = -144.1822 + (((tickAnim - 6) / 2) * (35.29167-(-144.1822)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 46.64887 + (((tickAnim - 8) / 5) * (96.70356-(46.64887)));
            yy = -0.42391 + (((tickAnim - 8) / 5) * (-42.92783-(-0.42391)));
            zz = 35.29167 + (((tickAnim - 8) / 5) * (63.48896-(35.29167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -145.27947 + (((tickAnim - 0) / 2) * (94.41298-(-145.27947)));
            yy = 5.44619 + (((tickAnim - 0) / 2) * (-4.18125-(5.44619)));
            zz = 144.18223 + (((tickAnim - 0) / 2) * (-83.13378-(144.18223)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 94.41298 + (((tickAnim - 2) / 4) * (96.70356-(94.41298)));
            yy = -4.18125 + (((tickAnim - 2) / 4) * (42.9278-(-4.18125)));
            zz = -83.13378 + (((tickAnim - 2) / 4) * (-63.489-(-83.13378)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 96.70356 + (((tickAnim - 6) / 3) * (62.58207-(96.70356)));
            yy = 42.9278 + (((tickAnim - 6) / 3) * (24.95856-(42.9278)));
            zz = -63.489 + (((tickAnim - 6) / 3) * (-28.05342-(-63.489)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 62.58207 + (((tickAnim - 9) / 4) * (-145.27947-(62.58207)));
            yy = 24.95856 + (((tickAnim - 9) / 4) * (5.44619-(24.95856)));
            zz = -28.05342 + (((tickAnim - 9) / 4) * (144.18223-(-28.05342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (42.2047-(0)));
            yy = 78.75 + (((tickAnim - 0) / 6) * (3.791-(78.75)));
            zz = 0 + (((tickAnim - 0) / 6) * (-47.6444-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 42.2047 + (((tickAnim - 6) / 3) * (23.82258-(42.2047)));
            yy = 3.791 + (((tickAnim - 6) / 3) * (49.40125-(3.791)));
            zz = -47.6444 + (((tickAnim - 6) / 3) * (-39.31224-(-47.6444)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 23.82258 + (((tickAnim - 9) / 4) * (0-(23.82258)));
            yy = 49.40125 + (((tickAnim - 9) / 4) * (78.75-(49.40125)));
            zz = -39.31224 + (((tickAnim - 9) / 4) * (0-(-39.31224)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -77.86414 + (((tickAnim - 0) / 6) * (-77.26001-(-77.86414)));
            yy = -13.05405 + (((tickAnim - 0) / 6) * (-30.0169-(-13.05405)));
            zz = -81.34881 + (((tickAnim - 0) / 6) * (-106.3535-(-81.34881)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -77.26001 + (((tickAnim - 6) / 3) * (-126.30334-(-77.26001)));
            yy = -30.0169 + (((tickAnim - 6) / 3) * (-30.77694-(-30.0169)));
            zz = -106.3535 + (((tickAnim - 6) / 3) * (-117.4742-(-106.3535)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -126.30334 + (((tickAnim - 9) / 4) * (-77.86414-(-126.30334)));
            yy = -30.77694 + (((tickAnim - 9) / 4) * (-13.05405-(-30.77694)));
            zz = -117.4742 + (((tickAnim - 9) / 4) * (-81.34881-(-117.4742)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-33.50138-(0)));
            yy = -50.75 + (((tickAnim - 0) / 2) * (-27.623-(-50.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (-16.17-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -33.50138 + (((tickAnim - 2) / 4) * (14.504-(-33.50138)));
            yy = -27.623 + (((tickAnim - 2) / 4) * (-20.1485-(-27.623)));
            zz = -16.17 + (((tickAnim - 2) / 4) * (52.8832-(-16.17)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 14.504 + (((tickAnim - 6) / 3) * (10.9585-(14.504)));
            yy = -20.1485 + (((tickAnim - 6) / 3) * (-42.60628-(-20.1485)));
            zz = 52.8832 + (((tickAnim - 6) / 3) * (42.63152-(52.8832)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10.9585 + (((tickAnim - 9) / 4) * (0-(10.9585)));
            yy = -42.60628 + (((tickAnim - 9) / 4) * (-50.75-(-42.60628)));
            zz = 42.63152 + (((tickAnim - 9) / 4) * (0-(42.63152)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 42.2047 + (((tickAnim - 0) / 3) * (53.84707-(42.2047)));
            yy = -3.79103 + (((tickAnim - 0) / 3) * (-45.99673-(-3.79103)));
            zz = 47.64443 + (((tickAnim - 0) / 3) * (45.5565-(47.64443)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 53.84707 + (((tickAnim - 3) / 3) * (0-(53.84707)));
            yy = -45.99673 + (((tickAnim - 3) / 3) * (-78.75-(-45.99673)));
            zz = 45.5565 + (((tickAnim - 3) / 3) * (0-(45.5565)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (42.2047-(0)));
            yy = -78.75 + (((tickAnim - 6) / 7) * (-3.79103-(-78.75)));
            zz = 0 + (((tickAnim - 6) / 7) * (47.64443-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -77.26001 + (((tickAnim - 0) / 3) * (-133.15071-(-77.26001)));
            yy = 30.01689 + (((tickAnim - 0) / 3) * (42.79602-(30.01689)));
            zz = 106.35348 + (((tickAnim - 0) / 3) * (131.73105-(106.35348)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -133.15071 + (((tickAnim - 3) / 3) * (-77.86414-(-133.15071)));
            yy = 42.79602 + (((tickAnim - 3) / 3) * (13.0541-(42.79602)));
            zz = 131.73105 + (((tickAnim - 3) / 3) * (81.3488-(131.73105)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -77.86414 + (((tickAnim - 6) / 7) * (-77.26001-(-77.86414)));
            yy = 13.0541 + (((tickAnim - 6) / 7) * (30.01689-(13.0541)));
            zz = 81.3488 + (((tickAnim - 6) / 7) * (106.35348-(81.3488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.504 + (((tickAnim - 0) / 2) * (13.07008-(14.504)));
            yy = 20.14847 + (((tickAnim - 0) / 2) * (45.16642-(20.14847)));
            zz = -52.88318 + (((tickAnim - 0) / 2) * (-52.5757-(-52.88318)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 13.07008 + (((tickAnim - 2) / 3) * (-24.89367-(13.07008)));
            yy = 45.16642 + (((tickAnim - 2) / 3) * (44.06302-(45.16642)));
            zz = -52.5757 + (((tickAnim - 2) / 3) * (28.52385-(-52.5757)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -24.89367 + (((tickAnim - 5) / 1) * (0-(-24.89367)));
            yy = 44.06302 + (((tickAnim - 5) / 1) * (50.75-(44.06302)));
            zz = 28.52385 + (((tickAnim - 5) / 1) * (0-(28.52385)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-33.50138-(0)));
            yy = 50.75 + (((tickAnim - 6) / 2) * (27.62304-(50.75)));
            zz = 0 + (((tickAnim - 6) / 2) * (16.17005-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -33.50138 + (((tickAnim - 8) / 5) * (14.504-(-33.50138)));
            yy = 27.62304 + (((tickAnim - 8) / 5) * (20.14847-(27.62304)));
            zz = 16.17005 + (((tickAnim - 8) / 5) * (-52.88318-(16.17005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-7.77526-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (78.1251-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (10.6685-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -7.77526 + (((tickAnim - 6) / 3) * (-10.70867-(-7.77526)));
            yy = 78.1251 + (((tickAnim - 6) / 3) * (40.01833-(78.1251)));
            zz = 10.6685 + (((tickAnim - 6) / 3) * (28.52724-(10.6685)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -10.70867 + (((tickAnim - 9) / 4) * (0-(-10.70867)));
            yy = 40.01833 + (((tickAnim - 9) / 4) * (0-(40.01833)));
            zz = 28.52724 + (((tickAnim - 9) / 4) * (0-(28.52724)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (109.6747-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-3.0199-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (96.8749-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 109.6747 + (((tickAnim - 6) / 7) * (0-(109.6747)));
            yy = -3.0199 + (((tickAnim - 6) / 7) * (0-(-3.0199)));
            zz = 96.8749 + (((tickAnim - 6) / 7) * (0-(96.8749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-20))*10), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-50))*1));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576))*-0.5);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-50))*-12), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*1));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-150))*-8), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*1));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-150))*8), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-150))*1));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-50))*7), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-150))*1));
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-80))*8), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*1));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(-1.25), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-150))*8), Tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*1));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-1.5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-200))*9), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*1));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0.5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-250))*13), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*1));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-300))*18), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*1));


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCoeruleodraco e = (EntityPrehistoricFloraCoeruleodraco) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);

    }
}
