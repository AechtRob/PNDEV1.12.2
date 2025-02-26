package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAcherontiscus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAcherontiscus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;

    private ModelAnimator animator;

    public ModelAcherontiscus() {
        this.textureWidth = 52;
        this.textureHeight = 40;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 13.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -1.5F, -17.3F);
        this.Root.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 12, -1.5F, -0.5F, 0.0F, 3, 2, 10, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 16, 14, -1.5F, -1.25F, 0.0F, 3, 1, 10, -0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.4F, 0.3F);
        this.Body1.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 16, 0, -0.5F, -1.0F, -4.0F, 1, 1, 4, 0.02F, false));
        this.Head.cubeList.add(new ModelBox(Head, 16, 14, -1.0F, -1.55F, -2.075F, 2, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.45F, 0.15F, -4.175F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2443F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.6F, 0.0F, -4.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2443F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.85F, -0.275F, -3.2F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2443F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.85F, -0.275F, -3.2F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2443F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.45F, 0.15F, -4.175F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2443F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 1.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.6F, 0.0F, -4.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2443F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.15F, 0.0F);
        this.Head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 5, -1.0F, -0.9F, -1.975F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 5, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.45F, 0.85F, -4.15F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.24F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 1, -1.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.45F, 0.85F, -4.15F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.24F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, 1.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.6F, 1.0F, -3.975F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.24F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.6F, 1.0F, -3.975F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.24F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -1.5F, -0.75F, -0.75F, 3, 2, 10, -0.01F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 16, 2, -1.5F, -1.25F, -0.75F, 3, 1, 10, -0.02F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.25F, 9.25F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 24, -1.0F, -1.0F, -1.0F, 2, 2, 10, 0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 24, 25, -1.0F, -1.25F, -1.0F, 2, 1, 10, -0.01F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 32, 0, -0.5F, -1.0F, -1.0F, 1, 2, 8, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 14, 25, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 4, 0.0F, -0.5F, 6.0F, 0, 1, 1, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 16, 7, 0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Root, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, -0.1F, -0.2F, 0.05F);
        this.setRotateAngle(Body2, -0.05F, -0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.1F, 0.3F, -0.05F);
        this.setRotateAngle(Body5, 0.2F, 0.4F, -0.1F);
        this.setRotateAngle(Head, 0.0F, 0.2F, -0.1F);
        this.Root.offsetZ = -0.05F;
        this.Root.offsetY = 0.05F;
        this.Root.offsetX = 0.018F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -2.0F;
        this.Root.offsetX = 0.4F;
        this.Root.rotateAngleY = (float)Math.toRadians(200);
        this.Root.rotateAngleX = (float)Math.toRadians(16);
        this.Root.rotateAngleZ = (float)Math.toRadians(-16);
        this.Root.scaleChildren = true;
        float scaler = 2.93F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        this.Root.offsetZ = -0.6F;

        EntityPrehistoricFloraAcherontiscus Acherontiscus = (EntityPrehistoricFloraAcherontiscus) e;

        this.faceTarget(f3, f4, 16, Head);
        AdvancedModelRenderer[] Tail = {this.Body2, this.Body3, this.Body4, this.Body5};
        Acherontiscus.tailBuffer.applyChainSwingBuffer(Tail);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAcherontiscus ee = (EntityPrehistoricFloraAcherontiscus) entitylivingbaseIn;

        //the only animation for this is managed directly by the animation ticker:
        if (ee.getIsMoving()) {
            animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
        } else {
            animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
        }

    }

    public void animMove(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraAcherontiscus entity = (EntityPrehistoricFloraAcherontiscus) entitylivingbaseIn;
        int animCycle = 30;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-90))*-10), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*1));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*1);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);


        this.setRotateAngle(Body1, Body1.rotateAngleX + (float) Math.toRadians(0.75), Body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-160))*25), Body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*2));
        this.Body1.rotationPointX = this.Body1.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*-1);
        this.Body1.rotationPointY = this.Body1.rotationPointY - (float)(0);
        this.Body1.rotationPointZ = this.Body1.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*0.5);


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-120))*10), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-60))*-4));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-290))*30), Body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*1));


        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0), Body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-340))*30), Body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*1));


        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0), Body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-390))*30), Body4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375))*1));


        this.setRotateAngle(Body5, Body5.rotateAngleX + (float) Math.toRadians(0), Body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.375-420))*30), Body5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.3755))*1));

       

    }

    

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
