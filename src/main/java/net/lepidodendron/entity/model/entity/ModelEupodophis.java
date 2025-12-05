package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEupodophis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEupodophis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer back;
    private final AdvancedModelRenderer back2;
    private final AdvancedModelRenderer back3;
    private final AdvancedModelRenderer back4;
    private final AdvancedModelRenderer back5;
    private final AdvancedModelRenderer back6;
    private final AdvancedModelRenderer back7;
    private final AdvancedModelRenderer back8;
    private final AdvancedModelRenderer back9;
    private final AdvancedModelRenderer back10;
    private final AdvancedModelRenderer back11;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer back12;
    private final AdvancedModelRenderer back13;
    private final AdvancedModelRenderer front;
    private final AdvancedModelRenderer front2;
    private final AdvancedModelRenderer front3;
    private final AdvancedModelRenderer front4;
    private final AdvancedModelRenderer front5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tongue;

    private ModelAnimator animator;

    public ModelEupodophis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 22.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 11, -1.5F, -3.0F, -22.0F, 3, 3, 6, 0.003F, false));

        this.back = new AdvancedModelRenderer(this);
        this.back.setRotationPoint(0.0F, -1.5F, -17.0F);
        this.main.addChild(back);
        this.back.cubeList.add(new ModelBox(back, 0, 21, -1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F, false));

        this.back2 = new AdvancedModelRenderer(this);
        this.back2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.back.addChild(back2);
        this.back2.cubeList.add(new ModelBox(back2, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, -0.003F, false));

        this.back3 = new AdvancedModelRenderer(this);
        this.back3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.back2.addChild(back3);
        this.back3.cubeList.add(new ModelBox(back3, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, 0.0F, false));

        this.back4 = new AdvancedModelRenderer(this);
        this.back4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.back3.addChild(back4);
        this.back4.cubeList.add(new ModelBox(back4, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, -0.003F, false));

        this.back5 = new AdvancedModelRenderer(this);
        this.back5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.back4.addChild(back5);
        this.back5.cubeList.add(new ModelBox(back5, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, 0.0F, false));

        this.back6 = new AdvancedModelRenderer(this);
        this.back6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.back5.addChild(back6);
        this.back6.cubeList.add(new ModelBox(back6, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, -0.003F, false));

        this.back7 = new AdvancedModelRenderer(this);
        this.back7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.back6.addChild(back7);
        this.back7.cubeList.add(new ModelBox(back7, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, 0.0F, false));

        this.back8 = new AdvancedModelRenderer(this);
        this.back8.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.back7.addChild(back8);
        this.back8.cubeList.add(new ModelBox(back8, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, -0.003F, false));

        this.back9 = new AdvancedModelRenderer(this);
        this.back9.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.back8.addChild(back9);
        this.back9.cubeList.add(new ModelBox(back9, 34, 31, -1.0F, -1.0F, 0.0F, 2, 2, 6, 0.003F, false));

        this.back10 = new AdvancedModelRenderer(this);
        this.back10.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.back9.addChild(back10);
        this.back10.cubeList.add(new ModelBox(back10, 21, 0, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.back11 = new AdvancedModelRenderer(this);
        this.back11.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.back10.addChild(back11);
        this.back11.cubeList.add(new ModelBox(back11, 19, 21, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.003F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.0F, 0.5F, 7.5F);
        this.back11.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.1958F, 0.7203F, -0.2921F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 38, 28, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.0F, 0.5F, 7.5F);
        this.back11.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.1958F, -0.7203F, 0.2921F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 38, 28, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.back12 = new AdvancedModelRenderer(this);
        this.back12.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.back11.addChild(back12);
        this.back12.cubeList.add(new ModelBox(back12, 38, 10, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.back13 = new AdvancedModelRenderer(this);
        this.back13.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.back12.addChild(back13);
        this.back13.cubeList.add(new ModelBox(back13, 38, 19, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.003F, false));
        this.back13.cubeList.add(new ModelBox(back13, 0, 40, 0.0F, -1.0F, 2.0F, 0, 2, 6, 0.0F, false));

        this.front = new AdvancedModelRenderer(this);
        this.front.setRotationPoint(0.0F, -1.5F, -21.0F);
        this.main.addChild(front);
        this.front.cubeList.add(new ModelBox(front, 0, 31, -1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F, false));

        this.front2 = new AdvancedModelRenderer(this);
        this.front2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.front.addChild(front2);
        this.front2.cubeList.add(new ModelBox(front2, 17, 31, -1.5F, -1.5F, -5.0F, 3, 3, 5, 0.003F, false));

        this.front3 = new AdvancedModelRenderer(this);
        this.front3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.front2.addChild(front3);
        this.front3.cubeList.add(new ModelBox(front3, 19, 11, -1.5F, -1.5F, -6.0F, 3, 3, 6, 0.0F, false));

        this.front4 = new AdvancedModelRenderer(this);
        this.front4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.front3.addChild(front4);
        this.front4.cubeList.add(new ModelBox(front4, 40, 0, -1.0F, -1.5F, -4.0F, 2, 3, 4, 0.003F, false));

        this.front5 = new AdvancedModelRenderer(this);
        this.front5.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.front4.addChild(front5);
        this.front5.cubeList.add(new ModelBox(front5, 13, 40, -1.0F, -1.5F, -3.75F, 2, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.0286F, -0.2482F, -3.7619F);
        this.front5.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 37, 40, -0.4714F, -0.3518F, -3.8881F, 1, 1, 4, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0286F, -0.3518F, -3.8881F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 46, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.2786F, 0.1482F, 0.1119F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1876F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 40, -1.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5576F, -0.1518F, -1.2685F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1214F, 0.1434F, -0.7069F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 28, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5004F, -0.1518F, -1.2685F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1214F, -0.1434F, 0.7069F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 28, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.2214F, 0.1482F, 0.1119F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1876F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 40, 0.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0286F, 0.6482F, 0.1119F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 46, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.25F, 0.5F, 0.0F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1876F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 48, -1.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.25F, 0.5F, 0.0F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1876F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 48, 0.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.tongue = new AdvancedModelRenderer(this);
        this.tongue.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.jaw.addChild(tongue);
        this.setRotateAngle(tongue, -0.0785F, 0.0F, 0.0F);
        this.tongue.cubeList.add(new ModelBox(tongue, 48, 40, -0.5F, 0.0F, -4.0F, 1, 0, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = 0.32F;
        this.main.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.4F;
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(90);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(front, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(back, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(back2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(back3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(back4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(back5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(back6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(back7, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(back8, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(back9, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(back10, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(back11, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(back12, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(back13, 0.0F, -0.2F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        EntityPrehistoricFloraEupodophis Eupodophis = (EntityPrehistoricFloraEupodophis) e;

//        this.faceTarget(f3, f4, 16, front4);
//        this.faceTarget(f3, f4, 16, front5);
//        this.faceTarget(f3, f4, 16, head);
        AdvancedModelRenderer[] Tail = {this.back, this.back2, this.back3, this.back4, this.back5, this.back6, this.back7, this.back8, this.back9, this.back10, this.back11, this.back12, this.back13};
        Eupodophis.tailBuffer.applyChainSwingBuffer(Tail);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEupodophis ee = (EntityPrehistoricFloraEupodophis) entitylivingbaseIn;

        //the only animation for this is managed directly by the animation ticker:
        animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animMove(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEupodophis entity = (EntityPrehistoricFloraEupodophis) entitylivingbaseIn;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*20), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(back, back.rotateAngleX + (float) Math.toRadians(0), back.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*10), back.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back2, back2.rotateAngleX + (float) Math.toRadians(0), back2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*10), back2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back3, back3.rotateAngleX + (float) Math.toRadians(0), back3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*10), back3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back4, back4.rotateAngleX + (float) Math.toRadians(0), back4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*10), back4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back5, back5.rotateAngleX + (float) Math.toRadians(0), back5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*10), back5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back6, back6.rotateAngleX + (float) Math.toRadians(0), back6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*10), back6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back7, back7.rotateAngleX + (float) Math.toRadians(0), back7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-210))*10), back7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back8, back8.rotateAngleX + (float) Math.toRadians(0), back8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-230))*13), back8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back9, back9.rotateAngleX + (float) Math.toRadians(0), back9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*15), back9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back10, back10.rotateAngleX + (float) Math.toRadians(0), back10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-270))*18), back10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back11, back11.rotateAngleX + (float) Math.toRadians(0), back11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-280))*20), back11.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back12, back12.rotateAngleX + (float) Math.toRadians(0), back12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-310))*25), back12.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(back13, back13.rotateAngleX + (float) Math.toRadians(0), back13.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*30), back13.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(front, front.rotateAngleX + (float) Math.toRadians(0), front.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-20), front.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2));
        this.setRotateAngle(front2, front2.rotateAngleX + (float) Math.toRadians(0), front2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-20), front2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));
        this.setRotateAngle(front3, front3.rotateAngleX + (float) Math.toRadians(0), front3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-8), front3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*2));
        this.setRotateAngle(front4, front4.rotateAngleX + (float) Math.toRadians(0), front4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*5), front4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*2));
        this.setRotateAngle(front5, front5.rotateAngleX + (float) Math.toRadians(0), front5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*20), front5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*15), head.rotateAngleZ + (float) Math.toRadians(0));



    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEupodophis entity = (EntityPrehistoricFloraEupodophis) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*4 + (((tickAnim - 19) / 21) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*4)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue, tongue.rotateAngleX + (float) Math.toRadians(xx), tongue.rotateAngleY + (float) Math.toRadians(yy), tongue.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = -1 + (((tickAnim - 18) / 22) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tongue.rotationPointX = this.tongue.rotationPointX + (float)(xx);
        this.tongue.rotationPointY = this.tongue.rotationPointY - (float)(yy);
        this.tongue.rotationPointZ = this.tongue.rotationPointZ + (float)(zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEupodophis entity = (EntityPrehistoricFloraEupodophis) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 32 && tickAnim < 51) {
            xx = 1 + (((tickAnim - 32) / 19) * (1.0575-(1)));
            yy = 1 + (((tickAnim - 32) / 19) * (1.0775-(1)));
            zz = 1 + (((tickAnim - 32) / 19) * (1-(1)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 1.0575 + (((tickAnim - 51) / 9) * (1-(1.0575)));
            yy = 1.0775 + (((tickAnim - 51) / 9) * (1-(1.0775)));
            zz = 1 + (((tickAnim - 51) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.front.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 0) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 22) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 22) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 41) {
            xx = 1 + (((tickAnim - 22) / 19) * (1.0575-(1)));
            yy = 1 + (((tickAnim - 22) / 19) * (1.0775-(1)));
            zz = 1 + (((tickAnim - 22) / 19) * (1-(1)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 1.0575 + (((tickAnim - 41) / 19) * (1-(1.0575)));
            yy = 1.0775 + (((tickAnim - 41) / 19) * (1-(1.0775)));
            zz = 1 + (((tickAnim - 41) / 19) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.front2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 0) / 22) * (1.075-(1)));
            yy = 1 + (((tickAnim - 0) / 22) * (1.115-(1)));
            zz = 1 + (((tickAnim - 0) / 22) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 1.075 + (((tickAnim - 22) / 4) * (1.075-(1.075)));
            yy = 1.115 + (((tickAnim - 22) / 4) * (1.115-(1.115)));
            zz = 1 + (((tickAnim - 22) / 4) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = 1.075 + (((tickAnim - 26) / 27) * (0.9825-(1.075)));
            yy = 1.115 + (((tickAnim - 26) / 27) * (0.91-(1.115)));
            zz = 1 + (((tickAnim - 26) / 27) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0.9825 + (((tickAnim - 53) / 7) * (1-(0.9825)));
            yy = 0.91 + (((tickAnim - 53) / 7) * (1-(0.91)));
            zz = 1 + (((tickAnim - 53) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.front3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.25 + (((tickAnim - 3) / 5) * (-7.5-(1.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -7.5 + (((tickAnim - 8) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (-1-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -1 + (((tickAnim - 17) / 5) * (0-(-1)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(front4, front4.rotateAngleX + (float) Math.toRadians(xx), front4.rotateAngleY + (float) Math.toRadians(yy), front4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 0) / 22) * (1.2125-(1)));
            yy = 1 + (((tickAnim - 0) / 22) * (0.9675-(1)));
            zz = 1 + (((tickAnim - 0) / 22) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 1.2125 + (((tickAnim - 22) / 4) * (1.2125-(1.2125)));
            yy = 0.9675 + (((tickAnim - 22) / 4) * (0.9675-(0.9675)));
            zz = 1 + (((tickAnim - 22) / 4) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = 1.2125 + (((tickAnim - 26) / 27) * (1-(1.2125)));
            yy = 0.9675 + (((tickAnim - 26) / 27) * (1-(0.9675)));
            zz = 1 + (((tickAnim - 26) / 27) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 53) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 53) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.front4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.25 + (((tickAnim - 3) / 2) * (-6-(2.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 5) / 3) * (6.82-(-6)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 6.82 + (((tickAnim - 8) / 0) * (14.11-(6.82)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 14.11 + (((tickAnim - 8) / 3) * (0-(14.11)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (-1-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -1 + (((tickAnim - 17) / 5) * (0-(-1)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(front5, front5.rotateAngleX + (float) Math.toRadians(xx), front5.rotateAngleY + (float) Math.toRadians(yy), front5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 0) / 22) * (0.9125-(1)));
            yy = 1 + (((tickAnim - 0) / 22) * (0.94-(1)));
            zz = 1 + (((tickAnim - 0) / 22) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0.9125 + (((tickAnim - 22) / 4) * (0.9125-(0.9125)));
            yy = 0.94 + (((tickAnim - 22) / 4) * (0.94-(0.94)));
            zz = 1 + (((tickAnim - 22) / 4) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 41) {
            xx = 0.9125 + (((tickAnim - 26) / 15) * (0.9367-(0.9125)));
            yy = 0.94 + (((tickAnim - 26) / 15) * (0.8738-(0.94)));
            zz = 1 + (((tickAnim - 26) / 15) * (1-(1)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = 0.9367 + (((tickAnim - 41) / 12) * (0.9742-(0.9367)));
            yy = 0.8738 + (((tickAnim - 41) / 12) * (0.9913-(0.8738)));
            zz = 1 + (((tickAnim - 41) / 12) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0.9742 + (((tickAnim - 53) / 7) * (1-(0.9742)));
            yy = 0.9913 + (((tickAnim - 53) / 7) * (1-(0.9913)));
            zz = 1 + (((tickAnim - 53) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.front5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5.5 + (((tickAnim - 3) / 1) * (-18.64-(-5.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -18.64 + (((tickAnim - 4) / 2) * (-1.75-(-18.64)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.75 + (((tickAnim - 6) / 4) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (-8-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -8 + (((tickAnim - 17) / 5) * (0-(-8)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 6.5 + (((tickAnim - 3) / 4) * (36.75-(6.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 36.75 + (((tickAnim - 7) / 2) * (0-(36.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (9.5-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 9.5 + (((tickAnim - 10) / 7) * (27.47212-(9.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (-0.51328-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (-1.03417-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 27.47212 + (((tickAnim - 17) / 5) * (0-(27.47212)));
            yy = -0.51328 + (((tickAnim - 17) / 5) * (0-(-0.51328)));
            zz = -1.03417 + (((tickAnim - 17) / 5) * (0-(-1.03417)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue, tongue.rotateAngleX + (float) Math.toRadians(xx), tongue.rotateAngleY + (float) Math.toRadians(yy), tongue.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEupodophis entity = (EntityPrehistoricFloraEupodophis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.25 + (((tickAnim - 3) / 5) * (-7.5-(1.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -7.5 + (((tickAnim - 8) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(front4, front4.rotateAngleX + (float) Math.toRadians(xx), front4.rotateAngleY + (float) Math.toRadians(yy), front4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.25 + (((tickAnim - 3) / 2) * (-6-(2.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 5) / 3) * (6.82-(-6)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 6.82 + (((tickAnim - 8) / 0) * (14.11-(6.82)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 14.11 + (((tickAnim - 8) / 3) * (0-(14.11)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(front5, front5.rotateAngleX + (float) Math.toRadians(xx), front5.rotateAngleY + (float) Math.toRadians(yy), front5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5.5 + (((tickAnim - 3) / 1) * (-18.64-(-5.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -18.64 + (((tickAnim - 4) / 2) * (-1.75-(-18.64)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.75 + (((tickAnim - 6) / 4) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 6.5 + (((tickAnim - 3) / 4) * (36.75-(6.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 36.75 + (((tickAnim - 7) / 2) * (0-(36.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue, tongue.rotateAngleX + (float) Math.toRadians(xx), tongue.rotateAngleY + (float) Math.toRadians(yy), tongue.rotateAngleZ + (float) Math.toRadians(zz));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
    }
}
