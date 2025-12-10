package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEucritta;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEucritta extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r19;

    private ModelAnimator animator;

    public ModelEucritta() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 22.75F, 4.0F);
        this.hip.cubeList.add(new ModelBox(hip, 18, 7, -1.5F, -1.1F, -0.5F, 3, 2, 5, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.3F, 4.5F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 14, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.65F, 0.9F, 2.0F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 36, -1.0F, -2.0F, -2.3F, 1, 2, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.65F, 0.9F, 2.0F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 36, 0.0F, -2.0F, -2.3F, 1, 2, 3, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.5F, 0.15F, 2.75F);
        this.hip.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.2182F, -0.1309F);
        this.legright.cubeList.add(new ModelBox(legright, 34, 35, -2.0F, -0.6F, -1.0F, 3, 1, 2, 0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-2.0F, 0.0F, -1.0F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.5236F, -0.1745F);
        this.legright2.cubeList.add(new ModelBox(legright2, 36, 26, -2.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-2.0F, 0.25F, 1.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, -0.0785F, -0.6981F, 0.3142F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 19, -3.5F, 0.0F, -2.25F, 4, 0, 4, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.5F, 0.15F, 2.75F);
        this.hip.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.2182F, 0.1309F);
        this.legleft.cubeList.add(new ModelBox(legleft, 34, 35, -1.0F, -0.6F, -1.0F, 3, 1, 2, 0.01F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(2.0F, 0.0F, -1.0F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, -0.5236F, 0.1745F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 36, 26, 0.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(2.0F, 0.25F, 1.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.0785F, 0.6981F, -0.3142F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 19, -0.5F, 0.0F, -2.25F, 4, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.1F, 4.5F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 12, 26, -1.0F, 0.0F, -0.5F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.35F, 3.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 26, -0.5F, 0.25F, -0.25F, 1, 1, 5, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 29, -0.5F, -0.25F, -0.25F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 4.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 20, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.7F, -5.0F, 5, 2, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 7, -2.0F, -1.5F, -5.0F, 4, 1, 5, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4F, -4.85F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.975F, -1.5F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 32, -1.5F, 0.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.2F, 1.65F, -1.25F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0262F, 0.0873F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 35, -1.0F, -2.0F, -1.0F, 1, 2, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.2F, 1.65F, -1.25F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0262F, -0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 35, 0.0F, -2.0F, -1.0F, 1, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.625F, -1.25F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0262F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 0, -1.5F, -2.0F, -1.0F, 4, 2, 3, 0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-2.25F, 0.875F, -1.25F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 0.1658F, 0.3927F, -0.1309F);
        this.armright.cubeList.add(new ModelBox(armright, 20, 5, -1.75F, -0.25F, 0.0F, 2, 1, 1, 0.01F, false));
        this.armright.cubeList.add(new ModelBox(armright, 26, 5, -1.75F, -0.25F, -0.5F, 2, 1, 1, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.75F, 0.25F, 1.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, -1.1781F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 36, 29, -2.0F, -0.5F, -1.0F, 2, 1, 1, -0.01F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-2.0F, 0.25F, -0.5F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.0262F, 0.0F, 0.2182F);
        this.armright3.cubeList.add(new ModelBox(armright3, 24, 35, -2.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(2.25F, 0.875F, -1.25F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.1658F, -0.3927F, 0.1309F);
        this.armleft.cubeList.add(new ModelBox(armleft, 20, 5, -0.25F, -0.25F, 0.0F, 2, 1, 1, 0.01F, true));
        this.armleft.cubeList.add(new ModelBox(armleft, 26, 5, -0.25F, -0.25F, -0.5F, 2, 1, 1, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.75F, 0.25F, 1.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, 1.1781F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 36, 29, 0.0F, -0.5F, -1.0F, 2, 1, 1, -0.01F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(2.0F, 0.25F, -0.5F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.0262F, 0.0F, -0.2182F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 24, 35, 0.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.65F, -2.175F);
        this.chest.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 16, 20, -0.5F, -1.0F, -4.975F, 1, 1, 5, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 16, -1.5F, -1.7F, -2.1F, 3, 1, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.225F, 0.0F, -2.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0436F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 12, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0F, -4.975F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.6152F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 0, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.225F, 0.0F, -2.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0436F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 12, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.0F, -4.975F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6152F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 0, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.45F, -4.075F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 36, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -4.975F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 23, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.05F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 23, -0.5F, 0.0F, -4.975F, 1, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 32, -2.0F, -0.85F, -1.725F, 4, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 1.0F, -4.975F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.6152F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 4, -2.0F, -1.0F, 0.0F, 2, 1, 3, -0.02F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.225F, 1.0F, -2.525F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0393F, 0.0436F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 8, -2.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.225F, 1.0F, -2.525F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0393F, -0.0436F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 8, 0.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.0F, -4.975F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.6152F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 4, 0.0F, -1.0F, 0.0F, 2, 1, 3, -0.02F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.975F, -1.55F, -2.55F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, 0.0F, 0.2182F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.8F, 0.875F, 0.25F);
        this.eyeright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.2618F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 31, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.975F, -1.55F, -2.55F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.0F, -0.2182F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.8F, 0.875F, 0.25F);
        this.eyeleft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.2618F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 31, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(chest, -0.01F, -0.2F, 0.0F);
        this.setRotateAngle(head, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.hip.offsetY = 0.068F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -1.7F;
        this.hip.offsetX = 0.2F;
        this.hip.offsetZ = 2.0F;
        this.hip.rotateAngleY = (float)Math.toRadians(200);
        this.hip.rotateAngleX = (float)Math.toRadians(8);
        this.hip.rotateAngleZ = (float)Math.toRadians(-8);
        this.hip.scaleChildren = true;
        float scaler = 3.4F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        EntityPrehistoricFloraEucritta entitySilesaurus = (EntityPrehistoricFloraEucritta) e;
        ((EntityPrehistoricFloraEucritta)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEucritta ee = (EntityPrehistoricFloraEucritta) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEucritta entity = (EntityPrehistoricFloraEucritta) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (9.91153-(0)));
            yy = -37 + (((tickAnim - 0) / 11) * (43.78337-(-37)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.53025-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 9.91153 + (((tickAnim - 11) / 6) * (-7.10817-(9.91153)));
            yy = 43.78337 + (((tickAnim - 11) / 6) * (13.04089-(43.78337)));
            zz = -0.53025 + (((tickAnim - 11) / 6) * (30.21816-(-0.53025)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -7.10817 + (((tickAnim - 17) / 6) * (0-(-7.10817)));
            yy = 13.04089 + (((tickAnim - 17) / 6) * (-37-(13.04089)));
            zz = 30.21816 + (((tickAnim - 17) / 6) * (0-(30.21816)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 9.91153 + (((tickAnim - 0) / 6) * (-7.10817-(9.91153)));
            yy = -43.7834 + (((tickAnim - 0) / 6) * (-13.0409-(-43.7834)));
            zz = 0.5303 + (((tickAnim - 0) / 6) * (-30.2182-(0.5303)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -7.10817 + (((tickAnim - 6) / 6) * (0-(-7.10817)));
            yy = -13.0409 + (((tickAnim - 6) / 6) * (37-(-13.0409)));
            zz = -30.2182 + (((tickAnim - 6) / 6) * (0-(-30.2182)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (9.91153-(0)));
            yy = 37 + (((tickAnim - 12) / 11) * (-43.7834-(37)));
            zz = 0 + (((tickAnim - 12) / 11) * (0.5303-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -35.80553 + (((tickAnim - 0) / 3) * (0-(-35.80553)));
            yy = -20.8142 + (((tickAnim - 0) / 3) * (-19.3-(-20.8142)));
            zz = 11.7445 + (((tickAnim - 0) / 3) * (0-(11.7445)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-4.99168-(0)));
            yy = -19.3 + (((tickAnim - 3) / 3) * (13.0304-(-19.3)));
            zz = 0 + (((tickAnim - 3) / 3) * (6.9231-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -4.99168 + (((tickAnim - 6) / 6) * (0-(-4.99168)));
            yy = 13.0304 + (((tickAnim - 6) / 6) * (13.25-(13.0304)));
            zz = 6.9231 + (((tickAnim - 6) / 6) * (0-(6.9231)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (-10.20398-(0)));
            yy = 13.25 + (((tickAnim - 12) / 5) * (-4.73426-(13.25)));
            zz = 0 + (((tickAnim - 12) / 5) * (-5.97367-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -10.20398 + (((tickAnim - 17) / 6) * (-35.80553-(-10.20398)));
            yy = -4.73426 + (((tickAnim - 17) / 6) * (-20.8142-(-4.73426)));
            zz = -5.97367 + (((tickAnim - 17) / 6) * (11.7445-(-5.97367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.38437 + (((tickAnim - 0) / 1) * (19.30558-(28.38437)));
            yy = 38.6376 + (((tickAnim - 0) / 1) * (21.1723-(38.6376)));
            zz = 35.1251 + (((tickAnim - 0) / 1) * (28.3037-(35.1251)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 19.30558 + (((tickAnim - 1) / 2) * (10.21207-(19.30558)));
            yy = 21.1723 + (((tickAnim - 1) / 2) * (-15.2339-(21.1723)));
            zz = 28.3037 + (((tickAnim - 1) / 2) * (25.0308-(28.3037)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 10.21207 + (((tickAnim - 3) / 3) * (20.07076-(10.21207)));
            yy = -15.2339 + (((tickAnim - 3) / 3) * (-55.6355-(-15.2339)));
            zz = 25.0308 + (((tickAnim - 3) / 3) * (29.5137-(25.0308)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 20.07076 + (((tickAnim - 6) / 3) * (-7.25-(20.07076)));
            yy = -55.6355 + (((tickAnim - 6) / 3) * (0-(-55.6355)));
            zz = 29.5137 + (((tickAnim - 6) / 3) * (4-(29.5137)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -7.25 + (((tickAnim - 9) / 3) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 4 + (((tickAnim - 9) / 3) * (0-(4)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (14.69271-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (38.93015-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (17.67564-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14.69271 + (((tickAnim - 18) / 5) * (28.38437-(14.69271)));
            yy = 38.93015 + (((tickAnim - 18) / 5) * (38.6376-(38.93015)));
            zz = 17.67564 + (((tickAnim - 18) / 5) * (35.1251-(17.67564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.3-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 6) / 6) * (0-(0.4)));
            zz = 0.3 + (((tickAnim - 6) / 6) * (0-(0.3)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 30.70897 + (((tickAnim - 0) / 6) * (9.57246-(30.70897)));
            yy = 25.487 + (((tickAnim - 0) / 6) * (-25.9092-(25.487)));
            zz = 14.7118 + (((tickAnim - 0) / 6) * (30.0366-(14.7118)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9.57246 + (((tickAnim - 6) / 6) * (0-(9.57246)));
            yy = -25.9092 + (((tickAnim - 6) / 6) * (-61.5-(-25.9092)));
            zz = 30.0366 + (((tickAnim - 6) / 6) * (0-(30.0366)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (30.70897-(0)));
            yy = -61.5 + (((tickAnim - 12) / 11) * (25.487-(-61.5)));
            zz = 0 + (((tickAnim - 12) / 11) * (14.7118-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8.9055-(0)));
            yy = 54.25 + (((tickAnim - 0) / 3) * (101.7394-(54.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (-51.7163-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 8.9055 + (((tickAnim - 3) / 3) * (18.37048-(8.9055)));
            yy = 101.7394 + (((tickAnim - 3) / 3) * (78.6224-(101.7394)));
            zz = -51.7163 + (((tickAnim - 3) / 3) * (-20.7969-(-51.7163)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 18.37048 + (((tickAnim - 6) / 3) * (-4.52218-(18.37048)));
            yy = 78.6224 + (((tickAnim - 6) / 3) * (31.1037-(78.6224)));
            zz = -20.7969 + (((tickAnim - 6) / 3) * (6.3541-(-20.7969)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -4.52218 + (((tickAnim - 9) / 3) * (4.14257-(-4.52218)));
            yy = 31.1037 + (((tickAnim - 9) / 3) * (21.3631-(31.1037)));
            zz = 6.3541 + (((tickAnim - 9) / 3) * (-4.5163-(6.3541)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 4.14257 + (((tickAnim - 12) / 11) * (0-(4.14257)));
            yy = 21.3631 + (((tickAnim - 12) / 11) * (54.25-(21.3631)));
            zz = -4.5163 + (((tickAnim - 12) / 11) * (0-(-4.5163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.575-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.575 + (((tickAnim - 3) / 3) * (0.58-(0.575)));
            yy = 0.3 + (((tickAnim - 3) / 3) * (0.2-(0.3)));
            zz = 0.2 + (((tickAnim - 3) / 3) * (-0.2-(0.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0.58 + (((tickAnim - 6) / 6) * (0-(0.58)));
            yy = 0.2 + (((tickAnim - 6) / 6) * (0-(0.2)));
            zz = -0.2 + (((tickAnim - 6) / 6) * (0-(-0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (25.3549-(0)));
            yy = -32 + (((tickAnim - 0) / 3) * (0.7746-(-32)));
            zz = 0 + (((tickAnim - 0) / 3) * (14.4113-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 25.3549 + (((tickAnim - 3) / 3) * (0-(25.3549)));
            yy = 0.7746 + (((tickAnim - 3) / 3) * (0-(0.7746)));
            zz = 14.4113 + (((tickAnim - 3) / 3) * (-54.25-(14.4113)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = -54.25 + (((tickAnim - 6) / 3) * (0-(-54.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (-17.88105-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (-19.2517-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (11.46037-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -17.88105 + (((tickAnim - 16) / 7) * (0-(-17.88105)));
            yy = -19.2517 + (((tickAnim - 16) / 7) * (-32-(-19.2517)));
            zz = 11.46037 + (((tickAnim - 16) / 7) * (0-(11.46037)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.3 + (((tickAnim - 0) / 6) * (0.15-(0.3)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.15 + (((tickAnim - 6) / 3) * (0-(0.15)));
            yy = 0.45 + (((tickAnim - 6) / 3) * (0-(0.45)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0.02-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.13-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0.02 + (((tickAnim - 13) / 0) * (0.05-(0.02)));
            yy = 0.13 + (((tickAnim - 13) / 0) * (0.175-(0.13)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.05 + (((tickAnim - 13) / 3) * (0.12-(0.05)));
            yy = 0.175 + (((tickAnim - 13) / 3) * (0.125-(0.175)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0.12 + (((tickAnim - 16) / 7) * (0.3-(0.12)));
            yy = 0.125 + (((tickAnim - 16) / 7) * (0-(0.125)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (30.70897-(0)));
            yy = 61.5 + (((tickAnim - 0) / 11) * (-25.487-(61.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (-14.7118-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 30.70897 + (((tickAnim - 11) / 6) * (9.57246-(30.70897)));
            yy = -25.487 + (((tickAnim - 11) / 6) * (25.9092-(-25.487)));
            zz = -14.7118 + (((tickAnim - 11) / 6) * (-30.03655-(-14.7118)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 9.57246 + (((tickAnim - 17) / 6) * (0-(9.57246)));
            yy = 25.9092 + (((tickAnim - 17) / 6) * (61.5-(25.9092)));
            zz = -30.03655 + (((tickAnim - 17) / 6) * (0-(-30.03655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 4.14257 + (((tickAnim - 0) / 11) * (0-(4.14257)));
            yy = -21.36313 + (((tickAnim - 0) / 11) * (-54.25-(-21.36313)));
            zz = 4.51634 + (((tickAnim - 0) / 11) * (0-(4.51634)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (-8.90547-(0)));
            yy = -54.25 + (((tickAnim - 11) / 3) * (-101.73939-(-54.25)));
            zz = 0 + (((tickAnim - 11) / 3) * (51.71632-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -8.90547 + (((tickAnim - 14) / 3) * (18.37048-(-8.90547)));
            yy = -101.73939 + (((tickAnim - 14) / 3) * (-78.62245-(-101.73939)));
            zz = 51.71632 + (((tickAnim - 14) / 3) * (20.79685-(51.71632)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 18.37048 + (((tickAnim - 17) / 2) * (-4.52218-(18.37048)));
            yy = -78.62245 + (((tickAnim - 17) / 2) * (-31.10371-(-78.62245)));
            zz = 20.79685 + (((tickAnim - 17) / 2) * (-6.35411-(20.79685)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -4.52218 + (((tickAnim - 19) / 4) * (4.14257-(-4.52218)));
            yy = -31.10371 + (((tickAnim - 19) / 4) * (-21.36313-(-31.10371)));
            zz = -6.35411 + (((tickAnim - 19) / 4) * (4.51634-(-6.35411)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (-0.575-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (-0.2-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -0.575 + (((tickAnim - 14) / 3) * (-0.58-(-0.575)));
            yy = 0.3 + (((tickAnim - 14) / 3) * (0.2-(0.3)));
            zz = -0.2 + (((tickAnim - 14) / 3) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -0.58 + (((tickAnim - 17) / 6) * (0-(-0.58)));
            yy = 0.2 + (((tickAnim - 17) / 6) * (0-(0.2)));
            zz = -0.2 + (((tickAnim - 17) / 6) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5))*0.5), hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*5.5), hip.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*-0.2);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-16.19346-(0)));
            yy = -13.25 + (((tickAnim - 0) / 5) * (11.47793-(-13.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.15401-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -16.19346 + (((tickAnim - 5) / 6) * (-35.80553-(-16.19346)));
            yy = 11.47793 + (((tickAnim - 5) / 6) * (20.81415-(11.47793)));
            zz = -2.15401 + (((tickAnim - 5) / 6) * (-11.74454-(-2.15401)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -35.80553 + (((tickAnim - 11) / 2) * (0-(-35.80553)));
            yy = 20.81415 + (((tickAnim - 11) / 2) * (19.3-(20.81415)));
            zz = -11.74454 + (((tickAnim - 11) / 2) * (0-(-11.74454)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-4.99168-(0)));
            yy = 19.3 + (((tickAnim - 13) / 4) * (-13.03042-(19.3)));
            zz = 0 + (((tickAnim - 13) / 4) * (-6.92308-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -4.99168 + (((tickAnim - 17) / 6) * (0-(-4.99168)));
            yy = -13.03042 + (((tickAnim - 17) / 6) * (-13.25-(-13.03042)));
            zz = -6.92308 + (((tickAnim - 17) / 6) * (0-(-6.92308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.07858-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-44.46882-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-7.58433-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 8.07858 + (((tickAnim - 5) / 6) * (28.38437-(8.07858)));
            yy = -44.46882 + (((tickAnim - 5) / 6) * (-38.63759-(-44.46882)));
            zz = -7.58433 + (((tickAnim - 5) / 6) * (-35.12512-(-7.58433)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 28.38437 + (((tickAnim - 11) / 1) * (19.30558-(28.38437)));
            yy = -38.63759 + (((tickAnim - 11) / 1) * (-21.17228-(-38.63759)));
            zz = -35.12512 + (((tickAnim - 11) / 1) * (-28.30369-(-35.12512)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 19.30558 + (((tickAnim - 12) / 1) * (10.21207-(19.30558)));
            yy = -21.17228 + (((tickAnim - 12) / 1) * (15.23389-(-21.17228)));
            zz = -28.30369 + (((tickAnim - 12) / 1) * (-25.03083-(-28.30369)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 10.21207 + (((tickAnim - 13) / 4) * (20.07076-(10.21207)));
            yy = 15.23389 + (((tickAnim - 13) / 4) * (55.63546-(15.23389)));
            zz = -25.03083 + (((tickAnim - 13) / 4) * (-29.5137-(-25.03083)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 20.07076 + (((tickAnim - 17) / 3) * (-7.25-(20.07076)));
            yy = 55.63546 + (((tickAnim - 17) / 3) * (0-(55.63546)));
            zz = -29.5137 + (((tickAnim - 17) / 3) * (4-(-29.5137)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -7.25 + (((tickAnim - 20) / 3) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 4 + (((tickAnim - 20) / 3) * (0-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0.4-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0.3-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 17) / 6) * (0-(0.4)));
            zz = 0.3 + (((tickAnim - 17) / 6) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5))*-0.5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*-5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-190))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+80))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+20))*8));
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(-0.075);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*-7.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*5.5), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-14.29216-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (8.65799-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-6.47493-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -14.29216 + (((tickAnim - 3) / 8) * (0-(-14.29216)));
            yy = 8.65799 + (((tickAnim - 3) / 8) * (32-(8.65799)));
            zz = -6.47493 + (((tickAnim - 3) / 8) * (0-(-6.47493)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (25.35494-(0)));
            yy = 32 + (((tickAnim - 11) / 3) * (0.77459-(32)));
            zz = 0 + (((tickAnim - 11) / 3) * (14.41127-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 25.35494 + (((tickAnim - 14) / 3) * (0-(25.35494)));
            yy = 0.77459 + (((tickAnim - 14) / 3) * (0-(0.77459)));
            zz = 14.41127 + (((tickAnim - 14) / 3) * (54.25-(14.41127)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 54.25 + (((tickAnim - 17) / 2) * (0-(54.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.04-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.155-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.04 + (((tickAnim - 2) / 1) * (-0.09-(-0.04)));
            yy = 0.155 + (((tickAnim - 2) / 1) * (0.15-(0.155)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -0.09 + (((tickAnim - 3) / 8) * (-0.3-(-0.09)));
            yy = 0.15 + (((tickAnim - 3) / 8) * (0-(0.15)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -0.3 + (((tickAnim - 11) / 6) * (-0.15-(-0.3)));
            yy = 0 + (((tickAnim - 11) / 6) * (0.45-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -0.15 + (((tickAnim - 17) / 2) * (0-(-0.15)));
            yy = 0.45 + (((tickAnim - 17) / 2) * (0-(0.45)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*5.5), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEucritta entity = (EntityPrehistoricFloraEucritta) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-15), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*0.5);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(41.16192), legright.rotateAngleY + (float) Math.toRadians(59.5985+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+80))*8), legright.rotateAngleZ + (float) Math.toRadians(-15.3536+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(-15.25), legright2.rotateAngleZ + (float) Math.toRadians(-33.25));
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(0.45);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(0.1);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(0);


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(6.45887), legright3.rotateAngleY + (float) Math.toRadians(43.7042), legright3.rotateAngleZ + (float) Math.toRadians(-21.4775));
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(0);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(0.275);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(0.25);


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(41.16192), legleft.rotateAngleY + (float) Math.toRadians(-59.5985+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+80))*8), legleft.rotateAngleZ + (float) Math.toRadians(15.3536+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*3));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(15.25), legleft2.rotateAngleZ + (float) Math.toRadians(33.25));
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(-0.45);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(0.1);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(0);


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(6.45887), legleft3.rotateAngleY + (float) Math.toRadians(-43.70423), legleft3.rotateAngleZ + (float) Math.toRadians(21.47753));
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(0);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(0.275);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(0.25);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-15), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-25), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*-35), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-100))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*-15), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(39.32148), armright.rotateAngleY + (float) Math.toRadians(28.2032), armright.rotateAngleZ + (float) Math.toRadians(-22.9878));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(10.33626), armright2.rotateAngleY + (float) Math.toRadians(50.8737), armright2.rotateAngleZ + (float) Math.toRadians(-32.5143));
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(0.225);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(0);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(0);


        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(0), armright3.rotateAngleY + (float) Math.toRadians(0), armright3.rotateAngleZ + (float) Math.toRadians(-25.25));
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(0.15);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(0.25);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(0);


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(39.32148), armleft.rotateAngleY + (float) Math.toRadians(-28.20325), armleft.rotateAngleZ + (float) Math.toRadians(22.98776));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(10.33626), armleft2.rotateAngleY + (float) Math.toRadians(-50.87369), armleft2.rotateAngleZ + (float) Math.toRadians(32.51434));
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(-0.225);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(0);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(0);


        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(0), armleft3.rotateAngleY + (float) Math.toRadians(0), armleft3.rotateAngleZ + (float) Math.toRadians(25.25));
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(-0.15);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(0.25);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*-10), head.rotateAngleZ + (float) Math.toRadians(0));
        

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEucritta entity = (EntityPrehistoricFloraEucritta) entitylivingbaseIn;
        int animCycle = 7;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (9.91153-(0)));
            yy = -37 + (((tickAnim - 0) / 4) * (43.78337-(-37)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.53025-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 9.91153 + (((tickAnim - 4) / 2) * (-7.10817-(9.91153)));
            yy = 43.78337 + (((tickAnim - 4) / 2) * (13.04089-(43.78337)));
            zz = -0.53025 + (((tickAnim - 4) / 2) * (30.21816-(-0.53025)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.10817 + (((tickAnim - 6) / 2) * (0-(-7.10817)));
            yy = 13.04089 + (((tickAnim - 6) / 2) * (-37-(13.04089)));
            zz = 30.21816 + (((tickAnim - 6) / 2) * (0-(30.21816)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.91153 + (((tickAnim - 0) / 2) * (-7.10817-(9.91153)));
            yy = -43.7834 + (((tickAnim - 0) / 2) * (-13.0409-(-43.7834)));
            zz = 0.5303 + (((tickAnim - 0) / 2) * (-30.2182-(0.5303)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -7.10817 + (((tickAnim - 2) / 2) * (0-(-7.10817)));
            yy = -13.0409 + (((tickAnim - 2) / 2) * (37-(-13.0409)));
            zz = -30.2182 + (((tickAnim - 2) / 2) * (0-(-30.2182)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (9.91153-(0)));
            yy = 37 + (((tickAnim - 4) / 4) * (-43.7834-(37)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.5303-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -35.80553 + (((tickAnim - 0) / 1) * (0-(-35.80553)));
            yy = -20.8142 + (((tickAnim - 0) / 1) * (-19.3-(-20.8142)));
            zz = 11.7445 + (((tickAnim - 0) / 1) * (0-(11.7445)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (-4.99168-(0)));
            yy = -19.3 + (((tickAnim - 1) / 1) * (13.0304-(-19.3)));
            zz = 0 + (((tickAnim - 1) / 1) * (6.9231-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -4.99168 + (((tickAnim - 2) / 2) * (0-(-4.99168)));
            yy = 13.0304 + (((tickAnim - 2) / 2) * (13.25-(13.0304)));
            zz = 6.9231 + (((tickAnim - 2) / 2) * (0-(6.9231)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-10.20398-(0)));
            yy = 13.25 + (((tickAnim - 4) / 2) * (-4.73426-(13.25)));
            zz = 0 + (((tickAnim - 4) / 2) * (-5.97367-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -10.20398 + (((tickAnim - 6) / 2) * (-35.80553-(-10.20398)));
            yy = -4.73426 + (((tickAnim - 6) / 2) * (-20.8142-(-4.73426)));
            zz = -5.97367 + (((tickAnim - 6) / 2) * (11.7445-(-5.97367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.38437 + (((tickAnim - 0) / 1) * (10.21207-(28.38437)));
            yy = 38.6376 + (((tickAnim - 0) / 1) * (-15.2339-(38.6376)));
            zz = 35.1251 + (((tickAnim - 0) / 1) * (25.0308-(35.1251)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 10.21207 + (((tickAnim - 1) / 1) * (20.07076-(10.21207)));
            yy = -15.2339 + (((tickAnim - 1) / 1) * (-55.6355-(-15.2339)));
            zz = 25.0308 + (((tickAnim - 1) / 1) * (29.5137-(25.0308)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 20.07076 + (((tickAnim - 2) / 1) * (-7.25-(20.07076)));
            yy = -55.6355 + (((tickAnim - 2) / 1) * (0-(-55.6355)));
            zz = 29.5137 + (((tickAnim - 2) / 1) * (4-(29.5137)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.25 + (((tickAnim - 3) / 1) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 4 + (((tickAnim - 3) / 1) * (0-(4)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (14.69271-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (38.93015-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (17.67564-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 14.69271 + (((tickAnim - 6) / 2) * (28.38437-(14.69271)));
            yy = 38.93015 + (((tickAnim - 6) / 2) * (38.6376-(38.93015)));
            zz = 17.67564 + (((tickAnim - 6) / 2) * (35.1251-(17.67564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.235-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.08-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.235 + (((tickAnim - 1) / 1) * (0.4-(0.235)));
            zz = 0.08 + (((tickAnim - 1) / 1) * (0.3-(0.08)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 2) / 2) * (0-(0.4)));
            zz = 0.3 + (((tickAnim - 2) / 2) * (0-(0.3)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.375 + (((tickAnim - 7) / 1) * (0.15-(0.375)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 30.70897 + (((tickAnim - 0) / 2) * (9.57246-(30.70897)));
            yy = 25.487 + (((tickAnim - 0) / 2) * (-25.9092-(25.487)));
            zz = 14.7118 + (((tickAnim - 0) / 2) * (30.0366-(14.7118)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 9.57246 + (((tickAnim - 2) / 2) * (0-(9.57246)));
            yy = -25.9092 + (((tickAnim - 2) / 2) * (-61.5-(-25.9092)));
            zz = 30.0366 + (((tickAnim - 2) / 2) * (0-(30.0366)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (30.70897-(0)));
            yy = -61.5 + (((tickAnim - 4) / 4) * (25.487-(-61.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (14.7118-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (8.9055-(0)));
            yy = 54.25 + (((tickAnim - 0) / 2) * (101.7394-(54.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (-51.7163-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.9055 + (((tickAnim - 2) / 1) * (-4.52218-(8.9055)));
            yy = 101.7394 + (((tickAnim - 2) / 1) * (31.1037-(101.7394)));
            zz = -51.7163 + (((tickAnim - 2) / 1) * (6.3541-(-51.7163)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -4.52218 + (((tickAnim - 3) / 1) * (4.14257-(-4.52218)));
            yy = 31.1037 + (((tickAnim - 3) / 1) * (21.3631-(31.1037)));
            zz = 6.3541 + (((tickAnim - 3) / 1) * (-4.5163-(6.3541)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.14257 + (((tickAnim - 4) / 4) * (0-(4.14257)));
            yy = 21.3631 + (((tickAnim - 4) / 4) * (54.25-(21.3631)));
            zz = -4.5163 + (((tickAnim - 4) / 4) * (0-(-4.5163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.575-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.575 + (((tickAnim - 2) / 2) * (0-(0.575)));
            yy = 0.3 + (((tickAnim - 2) / 2) * (0-(0.3)));
            zz = 0.2 + (((tickAnim - 2) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (25.3549-(0)));
            yy = -32 + (((tickAnim - 0) / 2) * (0.7746-(-32)));
            zz = 0 + (((tickAnim - 0) / 2) * (14.4113-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25.3549 + (((tickAnim - 2) / 1) * (0-(25.3549)));
            yy = 0.7746 + (((tickAnim - 2) / 1) * (0-(0.7746)));
            zz = 14.4113 + (((tickAnim - 2) / 1) * (0-(14.4113)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-17.88105-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (-19.2517-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (11.46037-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -17.88105 + (((tickAnim - 6) / 2) * (0-(-17.88105)));
            yy = -19.2517 + (((tickAnim - 6) / 2) * (-32-(-19.2517)));
            zz = 11.46037 + (((tickAnim - 6) / 2) * (0-(11.46037)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.3 + (((tickAnim - 0) / 2) * (0.15-(0.3)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.15 + (((tickAnim - 2) / 1) * (0-(0.15)));
            yy = 0.45 + (((tickAnim - 2) / 1) * (0-(0.45)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.4-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0.06-(0)));
            yy = 0.4 + (((tickAnim - 4) / 1) * (0.375-(0.4)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.06 + (((tickAnim - 5) / 1) * (0.12-(0.06)));
            yy = 0.375 + (((tickAnim - 5) / 1) * (0.125-(0.375)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.12 + (((tickAnim - 6) / 2) * (0.3-(0.12)));
            yy = 0.125 + (((tickAnim - 6) / 2) * (0-(0.125)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (30.70897-(0)));
            yy = 61.5 + (((tickAnim - 0) / 4) * (-25.487-(61.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (-14.7118-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 30.70897 + (((tickAnim - 4) / 2) * (9.57246-(30.70897)));
            yy = -25.487 + (((tickAnim - 4) / 2) * (25.9092-(-25.487)));
            zz = -14.7118 + (((tickAnim - 4) / 2) * (-30.03655-(-14.7118)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9.57246 + (((tickAnim - 6) / 2) * (0-(9.57246)));
            yy = 25.9092 + (((tickAnim - 6) / 2) * (61.5-(25.9092)));
            zz = -30.03655 + (((tickAnim - 6) / 2) * (0-(-30.03655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.14257 + (((tickAnim - 0) / 4) * (0-(4.14257)));
            yy = -21.36313 + (((tickAnim - 0) / 4) * (-54.25-(-21.36313)));
            zz = 4.51634 + (((tickAnim - 0) / 4) * (0-(4.51634)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (-8.90547-(0)));
            yy = -54.25 + (((tickAnim - 4) / 1) * (-101.73939-(-54.25)));
            zz = 0 + (((tickAnim - 4) / 1) * (51.71632-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -8.90547 + (((tickAnim - 5) / 1) * (18.37048-(-8.90547)));
            yy = -101.73939 + (((tickAnim - 5) / 1) * (-78.62245-(-101.73939)));
            zz = 51.71632 + (((tickAnim - 5) / 1) * (20.79685-(51.71632)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 18.37048 + (((tickAnim - 6) / 1) * (-4.52218-(18.37048)));
            yy = -78.62245 + (((tickAnim - 6) / 1) * (-31.10371-(-78.62245)));
            zz = 20.79685 + (((tickAnim - 6) / 1) * (-6.35411-(20.79685)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -4.52218 + (((tickAnim - 7) / 1) * (4.14257-(-4.52218)));
            yy = -31.10371 + (((tickAnim - 7) / 1) * (-21.36313-(-31.10371)));
            zz = -6.35411 + (((tickAnim - 7) / 1) * (4.51634-(-6.35411)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (-0.575-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0.3-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (-0.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.575 + (((tickAnim - 5) / 1) * (-0.58-(-0.575)));
            yy = 0.3 + (((tickAnim - 5) / 1) * (0.2-(0.3)));
            zz = -0.2 + (((tickAnim - 5) / 1) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.58 + (((tickAnim - 6) / 2) * (0-(-0.58)));
            yy = 0.2 + (((tickAnim - 6) / 2) * (0-(0.2)));
            zz = -0.2 + (((tickAnim - 6) / 2) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5))*4), hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-50))*15), hip.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960))*2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960))*-0.5);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-16.19346-(0)));
            yy = -13.25 + (((tickAnim - 0) / 2) * (11.47793-(-13.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (-2.15401-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -16.19346 + (((tickAnim - 2) / 2) * (-35.80553-(-16.19346)));
            yy = 11.47793 + (((tickAnim - 2) / 2) * (20.81415-(11.47793)));
            zz = -2.15401 + (((tickAnim - 2) / 2) * (-11.74454-(-2.15401)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -35.80553 + (((tickAnim - 4) / 2) * (-4.99168-(-35.80553)));
            yy = 20.81415 + (((tickAnim - 4) / 2) * (-13.03042-(20.81415)));
            zz = -11.74454 + (((tickAnim - 4) / 2) * (-6.92308-(-11.74454)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -4.99168 + (((tickAnim - 6) / 2) * (0-(-4.99168)));
            yy = -13.03042 + (((tickAnim - 6) / 2) * (-13.25-(-13.03042)));
            zz = -6.92308 + (((tickAnim - 6) / 2) * (0-(-6.92308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (8.07858-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-44.46882-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-7.58433-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 8.07858 + (((tickAnim - 2) / 2) * (28.38437-(8.07858)));
            yy = -44.46882 + (((tickAnim - 2) / 2) * (-38.63759-(-44.46882)));
            zz = -7.58433 + (((tickAnim - 2) / 2) * (-35.12512-(-7.58433)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 28.38437 + (((tickAnim - 4) / 2) * (20.07076-(28.38437)));
            yy = -38.63759 + (((tickAnim - 4) / 2) * (55.63546-(-38.63759)));
            zz = -35.12512 + (((tickAnim - 4) / 2) * (-29.5137-(-35.12512)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 20.07076 + (((tickAnim - 6) / 1) * (-7.25-(20.07076)));
            yy = 55.63546 + (((tickAnim - 6) / 1) * (0-(55.63546)));
            zz = -29.5137 + (((tickAnim - 6) / 1) * (4-(-29.5137)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -7.25 + (((tickAnim - 7) / 1) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 4 + (((tickAnim - 7) / 1) * (0-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.225 + (((tickAnim - 3) / 0) * (0.35-(0.225)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 3) / 1) * (0-(0.35)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.3-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 6) / 2) * (0-(0.4)));
            zz = 0.3 + (((tickAnim - 6) / 2) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5))*-4), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960))*-15), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-190))*22), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-50))*8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960+80))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960+20))*13));
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(-0.075);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-100))*-20), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-50))*-2.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0.35);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5))*-4), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-150))*15), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-14.29216-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (8.65799-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-6.47493-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -14.29216 + (((tickAnim - 2) / 2) * (0-(-14.29216)));
            yy = 8.65799 + (((tickAnim - 2) / 2) * (32-(8.65799)));
            zz = -6.47493 + (((tickAnim - 2) / 2) * (0-(-6.47493)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (25.35494-(0)));
            yy = 32 + (((tickAnim - 4) / 1) * (0.77459-(32)));
            zz = 0 + (((tickAnim - 4) / 1) * (14.41127-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 25.35494 + (((tickAnim - 5) / 1) * (0-(25.35494)));
            yy = 0.77459 + (((tickAnim - 5) / 1) * (0-(0.77459)));
            zz = 14.41127 + (((tickAnim - 5) / 1) * (54.25-(14.41127)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 54.25 + (((tickAnim - 6) / 1) * (0-(54.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.04-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.43-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.04 + (((tickAnim - 1) / 1) * (-0.09-(-0.04)));
            yy = 0.43 + (((tickAnim - 1) / 1) * (0.375-(0.43)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.09 + (((tickAnim - 2) / 2) * (-0.3-(-0.09)));
            yy = 0.375 + (((tickAnim - 2) / 2) * (0-(0.375)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.3 + (((tickAnim - 4) / 2) * (-0.15-(-0.3)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.45-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.15 + (((tickAnim - 6) / 1) * (0-(-0.15)));
            yy = 0.45 + (((tickAnim - 6) / 1) * (0-(0.45)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-200))*15), head.rotateAngleZ + (float) Math.toRadians(0));
        

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEucritta entity = (EntityPrehistoricFloraEucritta) entitylivingbaseIn;
        int animCycle = 7;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-23.63419-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.41278-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5.49512-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -23.63419 + (((tickAnim - 3) / 5) * (0-(-23.63419)));
            yy = 2.41278 + (((tickAnim - 3) / 5) * (0-(2.41278)));
            zz = 5.49512 + (((tickAnim - 3) / 5) * (0-(5.49512)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22.75 + (((tickAnim - 3) / 2) * (0-(22.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEucritta e = (EntityPrehistoricFloraEucritta) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
