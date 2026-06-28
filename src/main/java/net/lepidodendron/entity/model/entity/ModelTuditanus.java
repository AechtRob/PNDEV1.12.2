package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTuditanus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTuditanus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private ModelAnimator animator;

    public ModelTuditanus() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 18.1513F, 7.5914F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 0.8487F, 0.9086F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 26, 0.5F, 1.8F, -1.75F, 2, 1, 5, -0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, 0.0F, -0.7F, -1.75F, 3, 3, 5, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(0.5F, 2.8487F, 0.1586F);
        this.main.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0F, 0.3927F, 0.2182F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 39, 17, 0.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 11, 39, 0.0F, -0.6F, -1.0F, 3, 1, 2, -0.001F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(2.5F, -0.25F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.5834F, -0.2501F, -0.6418F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 40, 42, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, true));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.3699F, -0.0214F, 0.4393F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 28, 29, -1.5F, -0.5F, -4.0F, 3, 1, 4, 0.0F, true));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-0.5F, 2.8487F, 0.1586F);
        this.main.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0F, -0.3927F, -0.2182F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 39, 17, -3.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 11, 39, -3.0F, -0.6F, -1.0F, 3, 1, 2, -0.001F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-2.5F, -0.25F, 0.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.5834F, 0.2501F, 0.6418F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 40, 42, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.3699F, 0.0214F, -0.4393F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 28, 29, -1.5F, -0.5F, -4.0F, 3, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.3487F, 3.4586F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.5672F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 25, 0, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3927F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 33, -0.5F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.1513F, -0.0914F);
        this.main.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 1.0F, 0.75F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 18, 0.0F, 2.6F, -6.75F, 3, 1, 6, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -0.5F, -1.15F, -6.75F, 4, 4, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.75F, -5.3F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -1.25F, -6.95F, 5, 5, 7, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -6.95F);
        this.body2.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 21, 9, -2.0F, -1.175F, -3.0F, 4, 4, 4, -0.001F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-1.0F, 2.0F, -0.25F);
        this.neck.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0F, 0.0F, -0.2182F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 39, 17, -3.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 11, 39, -3.0F, -0.6F, -1.0F, 3, 1, 2, -0.001F, false));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-2.5F, -0.25F, 0.0F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.2284F, 0.2046F, 0.7182F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 40, 42, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 2.75F, 0.25F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.3099F, 0.0082F, -0.4901F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 28, 29, -1.5021F, -0.4238F, -3.7619F, 3, 1, 4, 0.0F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(1.0F, 2.0F, -0.25F);
        this.neck.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, 0.0F, 0.2182F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 39, 17, 0.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 11, 39, 0.0F, -0.6F, -1.0F, 3, 1, 2, -0.001F, true));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(2.5F, -0.25F, 0.0F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.2284F, -0.2046F, -0.7182F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 40, 42, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, true));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 2.75F, 0.25F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.3099F, -0.0082F, 0.4901F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 28, 29, -1.4979F, -0.4238F, -3.7619F, 3, 1, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.95F, -2.75F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 32, 24, -1.5F, -0.25F, -2.75F, 4, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 8, -1.5F, -0.25F, -0.75F, 4, 3, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 0, -0.5F, 0.75F, -5.525F, 2, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 32, -0.3F, 1.0F, -5.5F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 32, 1.3F, 1.0F, -5.5F, 0, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.25F, -2.75F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 35, -0.5F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.501F, 1.25F, -2.7424F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 40, -1.0F, -0.5F, -3.0F, 1, 1, 3, -0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.501F, 1.25F, -2.7424F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3927F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 40, 0.0F, -0.5F, -3.0F, 1, 1, 3, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.75F, -1.225F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 0, 0.0F, 0.0F, -4.3F, 2, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 13, 0.25F, -0.25F, -3.275F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 13, 1.75F, -0.25F, -3.275F, 0, 1, 1, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 33, -1.0F, 0.0F, -1.525F, 4, 1, 2, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 40, 0.0F, -1.5F, -1.525F, 2, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.0F, -1.025F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3578F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 34, -0.5F, -0.875F, -0.5F, 2, 1, 3, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.001F, -0.5F, -1.5174F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 39, -1.0F, 0.5F, -3.0F, 1, 1, 3, -0.001F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.001F, -0.5F, -1.5174F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 39, 0.0F, 0.5F, -3.0F, 1, 1, 3, -0.001F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.5F, 0.75F, -2.9633F);
        this.head.addChild(eyes);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, 0.2133F);
        this.eyes.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3054F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -0.575F, -0.5F, -0.7F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, 0.2133F);
        this.eyes.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3054F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 13, -0.425F, -0.5F, -0.7F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.base.offsetZ = this.base.offsetZ + 0.7F;
        this.main.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.6F;
        this.main.offsetX = 0.6F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);
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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTuditanus ee = (EntityPrehistoricFloraTuditanus) entitylivingbaseIn;

        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


        }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTuditanus entity = (EntityPrehistoricFloraTuditanus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 4) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.225 + (((tickAnim - 12) / 8) * (0-(0.225)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyes.rotationPointX = this.eyes.rotationPointX + (float)(xx);
        this.eyes.rotationPointY = this.eyes.rotationPointY - (float)(yy);
        this.eyes.rotationPointZ = this.eyes.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 8) / 4) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 8) / 4) * (0.0025-(0.0025)));
            zz = 1 + (((tickAnim - 8) / 4) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 12) / 8) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 12) / 8) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 12) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTuditanus entity = (EntityPrehistoricFloraTuditanus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+30))*-4), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+30))*-7), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.96714 + (((tickAnim - 0) / 3) * (-3.79069-(20.96714)));
            yy = -40.16344 + (((tickAnim - 0) / 3) * (-9.22567-(-40.16344)));
            zz = -11.79315 + (((tickAnim - 0) / 3) * (-28.04272-(-11.79315)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -3.79069 + (((tickAnim - 3) / 3) * (-6.11608-(-3.79069)));
            yy = -9.22567 + (((tickAnim - 3) / 3) * (1.69363-(-9.22567)));
            zz = -28.04272 + (((tickAnim - 3) / 3) * (-21.72877-(-28.04272)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.11608 + (((tickAnim - 6) / 2) * (-4.74342-(-6.11608)));
            yy = 1.69363 + (((tickAnim - 6) / 2) * (11.45972-(1.69363)));
            zz = -21.72877 + (((tickAnim - 6) / 2) * (-8.44914-(-21.72877)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -4.74342 + (((tickAnim - 8) / 7) * (20.96714-(-4.74342)));
            yy = 11.45972 + (((tickAnim - 8) / 7) * (-40.16344-(11.45972)));
            zz = -8.44914 + (((tickAnim - 8) / 7) * (-11.79315-(-8.44914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.13234 + (((tickAnim - 0) / 3) * (0.97147-(8.13234)));
            yy = 20.95761 + (((tickAnim - 0) / 3) * (6.656-(20.95761)));
            zz = 13.97362 + (((tickAnim - 0) / 3) * (-25.17637-(13.97362)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.97147 + (((tickAnim - 3) / 3) * (-13.83316-(0.97147)));
            yy = 6.656 + (((tickAnim - 3) / 3) * (4.39762-(6.656)));
            zz = -25.17637 + (((tickAnim - 3) / 3) * (-27.47201-(-25.17637)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -13.83316 + (((tickAnim - 6) / 2) * (-34.30057-(-13.83316)));
            yy = 4.39762 + (((tickAnim - 6) / 2) * (-8.5446-(4.39762)));
            zz = -27.47201 + (((tickAnim - 6) / 2) * (6.51394-(-27.47201)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -34.30057 + (((tickAnim - 8) / 7) * (8.13234-(-34.30057)));
            yy = -8.5446 + (((tickAnim - 8) / 7) * (20.95761-(-8.5446)));
            zz = 6.51394 + (((tickAnim - 8) / 7) * (13.97362-(6.51394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 22.5 + (((tickAnim - 0) / 2) * (95.57-(22.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 95.57 + (((tickAnim - 2) / 1) * (125.25-(95.57)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 125.25 + (((tickAnim - 3) / 5) * (39.3818-(125.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (-10.64868-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-7.03597-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 39.3818 + (((tickAnim - 8) / 3) * (8.81428-(39.3818)));
            yy = -10.64868 + (((tickAnim - 8) / 3) * (-5.95869-(-10.64868)));
            zz = -7.03597 + (((tickAnim - 8) / 3) * (-1.39787-(-7.03597)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 8.81428 + (((tickAnim - 11) / 4) * (22.5-(8.81428)));
            yy = -5.95869 + (((tickAnim - 11) / 4) * (0-(-5.95869)));
            zz = -1.39787 + (((tickAnim - 11) / 4) * (0-(-1.39787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (0.93-(0.35)));
            zz = 0.2 + (((tickAnim - 0) / 2) * (-0.28-(0.2)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.93 + (((tickAnim - 2) / 1) * (0.95-(0.93)));
            zz = -0.28 + (((tickAnim - 2) / 1) * (-0.6-(-0.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 3) / 5) * (0-(0.95)));
            zz = -0.6 + (((tickAnim - 3) / 5) * (0-(-0.6)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.08-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.32 + (((tickAnim - 11) / 4) * (0.35-(-0.32)));
            zz = 0.08 + (((tickAnim - 11) / 4) * (0.2-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -4.74342 + (((tickAnim - 0) / 8) * (20.96714-(-4.74342)));
            yy = -11.45972 + (((tickAnim - 0) / 8) * (40.16344-(-11.45972)));
            zz = 8.44914 + (((tickAnim - 0) / 8) * (11.79315-(8.44914)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 20.96714 + (((tickAnim - 8) / 4) * (-3.79069-(20.96714)));
            yy = 40.16344 + (((tickAnim - 8) / 4) * (9.22567-(40.16344)));
            zz = 11.79315 + (((tickAnim - 8) / 4) * (28.04272-(11.79315)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -3.79069 + (((tickAnim - 12) / 1) * (-6.11608-(-3.79069)));
            yy = 9.22567 + (((tickAnim - 12) / 1) * (-1.69363-(9.22567)));
            zz = 28.04272 + (((tickAnim - 12) / 1) * (21.72877-(28.04272)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -6.11608 + (((tickAnim - 13) / 2) * (-4.74342-(-6.11608)));
            yy = -1.69363 + (((tickAnim - 13) / 2) * (-11.45972-(-1.69363)));
            zz = 21.72877 + (((tickAnim - 13) / 2) * (8.44914-(21.72877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -34.30057 + (((tickAnim - 0) / 8) * (8.13234-(-34.30057)));
            yy = 8.5446 + (((tickAnim - 0) / 8) * (-20.95761-(8.5446)));
            zz = -6.51394 + (((tickAnim - 0) / 8) * (-13.97362-(-6.51394)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 8.13234 + (((tickAnim - 8) / 4) * (0.97147-(8.13234)));
            yy = -20.95761 + (((tickAnim - 8) / 4) * (-6.656-(-20.95761)));
            zz = -13.97362 + (((tickAnim - 8) / 4) * (25.17637-(-13.97362)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0.97147 + (((tickAnim - 12) / 1) * (-13.83316-(0.97147)));
            yy = -6.656 + (((tickAnim - 12) / 1) * (-4.39762-(-6.656)));
            zz = 25.17637 + (((tickAnim - 12) / 1) * (27.47201-(25.17637)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -13.83316 + (((tickAnim - 13) / 2) * (-34.30057-(-13.83316)));
            yy = -4.39762 + (((tickAnim - 13) / 2) * (8.5446-(-4.39762)));
            zz = 27.47201 + (((tickAnim - 13) / 2) * (-6.51394-(27.47201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39.3818 + (((tickAnim - 0) / 3) * (8.81428-(39.3818)));
            yy = 10.64868 + (((tickAnim - 0) / 3) * (-5.95869-(10.64868)));
            zz = 7.03597 + (((tickAnim - 0) / 3) * (-1.39787-(7.03597)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.81428 + (((tickAnim - 3) / 5) * (22.5-(8.81428)));
            yy = -5.95869 + (((tickAnim - 3) / 5) * (0-(-5.95869)));
            zz = -1.39787 + (((tickAnim - 3) / 5) * (0-(-1.39787)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.5 + (((tickAnim - 8) / 1) * (95.57-(22.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 95.57 + (((tickAnim - 9) / 3) * (125.25-(95.57)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 125.25 + (((tickAnim - 12) / 3) * (39.3818-(125.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (10.64868-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (7.03597-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.08-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.32 + (((tickAnim - 3) / 5) * (0.35-(-0.32)));
            zz = 0.08 + (((tickAnim - 3) / 5) * (0.2-(0.08)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 1) * (0.93-(0.35)));
            zz = 0.2 + (((tickAnim - 8) / 1) * (-0.28-(0.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.93 + (((tickAnim - 9) / 3) * (0.95-(0.93)));
            zz = -0.28 + (((tickAnim - 9) / 3) * (-0.6-(-0.28)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 12) / 3) * (0-(0.95)));
            zz = -0.6 + (((tickAnim - 12) / 3) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+30))*4), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*10), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*-10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*7), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+20))*4), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-7), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*7), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 49.27696 + (((tickAnim - 0) / 4) * (-5.62704-(49.27696)));
            yy = 23.03113 + (((tickAnim - 0) / 4) * (-4.9613-(23.03113)));
            zz = 14.92932 + (((tickAnim - 0) / 4) * (23.56695-(14.92932)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -5.62704 + (((tickAnim - 4) / 4) * (11.82508-(-5.62704)));
            yy = -4.9613 + (((tickAnim - 4) / 4) * (-33.50881-(-4.9613)));
            zz = 23.56695 + (((tickAnim - 4) / 4) * (-6.83375-(23.56695)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.82508 + (((tickAnim - 8) / 7) * (49.27696-(11.82508)));
            yy = -33.50881 + (((tickAnim - 8) / 7) * (23.03113-(-33.50881)));
            zz = -6.83375 + (((tickAnim - 8) / 7) * (14.92932-(-6.83375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.52168 + (((tickAnim - 0) / 4) * (-34.43821-(17.52168)));
            yy = -0.41455 + (((tickAnim - 0) / 4) * (8.68604-(-0.41455)));
            zz = 6.36446 + (((tickAnim - 0) / 4) * (-3.30222-(6.36446)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -34.43821 + (((tickAnim - 4) / 4) * (-5-(-34.43821)));
            yy = 8.68604 + (((tickAnim - 4) / 4) * (20.25-(8.68604)));
            zz = -3.30222 + (((tickAnim - 4) / 4) * (0-(-3.30222)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 8) / 7) * (17.52168-(-5)));
            yy = 20.25 + (((tickAnim - 8) / 7) * (-0.41455-(20.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (6.36446-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 5.86524 + (((tickAnim - 0) / 2) * (99.50146-(5.86524)));
            yy = -15.14952 + (((tickAnim - 0) / 2) * (-15.06195-(-15.14952)));
            zz = -16.23794 + (((tickAnim - 0) / 2) * (2.56062-(-16.23794)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 99.50146 + (((tickAnim - 2) / 1) * (139.99452-(99.50146)));
            yy = -15.06195 + (((tickAnim - 2) / 1) * (-9.35922-(-15.06195)));
            zz = 2.56062 + (((tickAnim - 2) / 1) * (2.28862-(2.56062)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 139.99452 + (((tickAnim - 3) / 1) * (130.81627-(139.99452)));
            yy = -9.35922 + (((tickAnim - 3) / 1) * (0.14533-(-9.35922)));
            zz = 2.28862 + (((tickAnim - 3) / 1) * (1.83529-(2.28862)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 130.81627 + (((tickAnim - 4) / 2) * (18.43084-(130.81627)));
            yy = 0.14533 + (((tickAnim - 4) / 2) * (3.06873-(0.14533)));
            zz = 1.83529 + (((tickAnim - 4) / 2) * (-9.91372-(1.83529)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 18.43084 + (((tickAnim - 6) / 2) * (12.45358-(18.43084)));
            yy = 3.06873 + (((tickAnim - 6) / 2) * (13.49485-(3.06873)));
            zz = -9.91372 + (((tickAnim - 6) / 2) * (11.25802-(-9.91372)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 12.45358 + (((tickAnim - 8) / 3) * (-18.14342-(12.45358)));
            yy = 13.49485 + (((tickAnim - 8) / 3) * (2.56508-(13.49485)));
            zz = 11.25802 + (((tickAnim - 8) / 3) * (-10.23223-(11.25802)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -18.14342 + (((tickAnim - 11) / 4) * (5.86524-(-18.14342)));
            yy = 2.56508 + (((tickAnim - 11) / 4) * (-15.14952-(2.56508)));
            zz = -10.23223 + (((tickAnim - 11) / 4) * (-16.23794-(-10.23223)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.8-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 4) / 2) * (0.3-(-0.1)));
            zz = -0.8 + (((tickAnim - 4) / 2) * (0-(-0.8)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 2) * (0-(0.3)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 11) / 4) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 11.82508 + (((tickAnim - 0) / 8) * (49.27696-(11.82508)));
            yy = 33.50881 + (((tickAnim - 0) / 8) * (-23.03113-(33.50881)));
            zz = 6.83375 + (((tickAnim - 0) / 8) * (-14.92932-(6.83375)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 49.27696 + (((tickAnim - 8) / 4) * (-5.62704-(49.27696)));
            yy = -23.03113 + (((tickAnim - 8) / 4) * (4.9613-(-23.03113)));
            zz = -14.92932 + (((tickAnim - 8) / 4) * (-23.56695-(-14.92932)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -5.62704 + (((tickAnim - 12) / 3) * (11.82508-(-5.62704)));
            yy = 4.9613 + (((tickAnim - 12) / 3) * (33.50881-(4.9613)));
            zz = -23.56695 + (((tickAnim - 12) / 3) * (6.83375-(-23.56695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 0) / 8) * (17.52168-(-5)));
            yy = -20.25 + (((tickAnim - 0) / 8) * (0.41455-(-20.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (-6.36446-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 17.52168 + (((tickAnim - 8) / 4) * (-34.43821-(17.52168)));
            yy = 0.41455 + (((tickAnim - 8) / 4) * (-8.68604-(0.41455)));
            zz = -6.36446 + (((tickAnim - 8) / 4) * (3.30222-(-6.36446)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -34.43821 + (((tickAnim - 12) / 3) * (-5-(-34.43821)));
            yy = -8.68604 + (((tickAnim - 12) / 3) * (-20.25-(-8.68604)));
            zz = 3.30222 + (((tickAnim - 12) / 3) * (0-(3.30222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.45358 + (((tickAnim - 0) / 3) * (-18.14342-(12.45358)));
            yy = -13.49485 + (((tickAnim - 0) / 3) * (-2.56508-(-13.49485)));
            zz = -11.25802 + (((tickAnim - 0) / 3) * (10.23223-(-11.25802)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -18.14342 + (((tickAnim - 3) / 5) * (5.86524-(-18.14342)));
            yy = -2.56508 + (((tickAnim - 3) / 5) * (15.14952-(-2.56508)));
            zz = 10.23223 + (((tickAnim - 3) / 5) * (16.23794-(10.23223)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 5.86524 + (((tickAnim - 8) / 1) * (99.50146-(5.86524)));
            yy = 15.14952 + (((tickAnim - 8) / 1) * (-15.06195-(15.14952)));
            zz = 16.23794 + (((tickAnim - 8) / 1) * (2.56062-(16.23794)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 99.50146 + (((tickAnim - 9) / 1) * (139.99452-(99.50146)));
            yy = -15.06195 + (((tickAnim - 9) / 1) * (-9.35922-(-15.06195)));
            zz = 2.56062 + (((tickAnim - 9) / 1) * (2.28862-(2.56062)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 139.99452 + (((tickAnim - 10) / 2) * (130.81627-(139.99452)));
            yy = -9.35922 + (((tickAnim - 10) / 2) * (0.14533-(-9.35922)));
            zz = 2.28862 + (((tickAnim - 10) / 2) * (1.83529-(2.28862)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 130.81627 + (((tickAnim - 12) / 2) * (18.43084-(130.81627)));
            yy = 0.14533 + (((tickAnim - 12) / 2) * (-3.06873-(0.14533)));
            zz = 1.83529 + (((tickAnim - 12) / 2) * (9.91372-(1.83529)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 18.43084 + (((tickAnim - 14) / 1) * (12.45358-(18.43084)));
            yy = -3.06873 + (((tickAnim - 14) / 1) * (-13.49485-(-3.06873)));
            zz = 9.91372 + (((tickAnim - 14) / 1) * (-11.25802-(9.91372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 3) / 5) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.8-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 12) / 2) * (0.3-(-0.1)));
            zz = -0.8 + (((tickAnim - 12) / 2) * (0-(-0.8)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 14) / 1) * (0-(0.3)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTuditanus entity = (EntityPrehistoricFloraTuditanus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+30))*-4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*-2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 20.96714 + (((tickAnim - 0) / 8) * (-3.79069-(20.96714)));
            yy = -40.16344 + (((tickAnim - 0) / 8) * (-9.22567-(-40.16344)));
            zz = -11.79315 + (((tickAnim - 0) / 8) * (-28.04272-(-11.79315)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.79069 + (((tickAnim - 8) / 5) * (-6.11608-(-3.79069)));
            yy = -9.22567 + (((tickAnim - 8) / 5) * (1.69363-(-9.22567)));
            zz = -28.04272 + (((tickAnim - 8) / 5) * (-21.72877-(-28.04272)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.11608 + (((tickAnim - 13) / 5) * (-4.74342-(-6.11608)));
            yy = 1.69363 + (((tickAnim - 13) / 5) * (11.45972-(1.69363)));
            zz = -21.72877 + (((tickAnim - 13) / 5) * (-8.44914-(-21.72877)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -4.74342 + (((tickAnim - 18) / 17) * (20.96714-(-4.74342)));
            yy = 11.45972 + (((tickAnim - 18) / 17) * (-40.16344-(11.45972)));
            zz = -8.44914 + (((tickAnim - 18) / 17) * (-11.79315-(-8.44914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.13234 + (((tickAnim - 0) / 8) * (0.97147-(8.13234)));
            yy = 20.95761 + (((tickAnim - 0) / 8) * (6.656-(20.95761)));
            zz = 13.97362 + (((tickAnim - 0) / 8) * (-25.17637-(13.97362)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.97147 + (((tickAnim - 8) / 5) * (-13.83316-(0.97147)));
            yy = 6.656 + (((tickAnim - 8) / 5) * (4.39762-(6.656)));
            zz = -25.17637 + (((tickAnim - 8) / 5) * (-27.47201-(-25.17637)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -13.83316 + (((tickAnim - 13) / 5) * (-34.30057-(-13.83316)));
            yy = 4.39762 + (((tickAnim - 13) / 5) * (-8.5446-(4.39762)));
            zz = -27.47201 + (((tickAnim - 13) / 5) * (6.51394-(-27.47201)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -34.30057 + (((tickAnim - 18) / 17) * (8.13234-(-34.30057)));
            yy = -8.5446 + (((tickAnim - 18) / 17) * (20.95761-(-8.5446)));
            zz = 6.51394 + (((tickAnim - 18) / 17) * (13.97362-(6.51394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22.5 + (((tickAnim - 0) / 4) * (95.57-(22.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 95.57 + (((tickAnim - 4) / 4) * (125.25-(95.57)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 125.25 + (((tickAnim - 8) / 10) * (39.3818-(125.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (-10.64868-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (-7.03597-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 39.3818 + (((tickAnim - 18) / 6) * (8.81428-(39.3818)));
            yy = -10.64868 + (((tickAnim - 18) / 6) * (-5.95869-(-10.64868)));
            zz = -7.03597 + (((tickAnim - 18) / 6) * (-1.39787-(-7.03597)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 8.81428 + (((tickAnim - 24) / 11) * (22.5-(8.81428)));
            yy = -5.95869 + (((tickAnim - 24) / 11) * (0-(-5.95869)));
            zz = -1.39787 + (((tickAnim - 24) / 11) * (0-(-1.39787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 4) * (0.93-(0.35)));
            zz = 0.2 + (((tickAnim - 0) / 4) * (-0.28-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.93 + (((tickAnim - 4) / 4) * (0.95-(0.93)));
            zz = -0.28 + (((tickAnim - 4) / 4) * (-0.6-(-0.28)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.95 + (((tickAnim - 8) / 10) * (0-(0.95)));
            zz = -0.6 + (((tickAnim - 8) / 10) * (0-(-0.6)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.08-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = -0.32 + (((tickAnim - 24) / 11) * (0.35-(-0.32)));
            zz = 0.08 + (((tickAnim - 24) / 11) * (0.2-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -4.74342 + (((tickAnim - 0) / 18) * (20.96714-(-4.74342)));
            yy = -11.45972 + (((tickAnim - 0) / 18) * (40.16344-(-11.45972)));
            zz = 8.44914 + (((tickAnim - 0) / 18) * (11.79315-(8.44914)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 20.96714 + (((tickAnim - 18) / 8) * (-3.79069-(20.96714)));
            yy = 40.16344 + (((tickAnim - 18) / 8) * (9.22567-(40.16344)));
            zz = 11.79315 + (((tickAnim - 18) / 8) * (28.04272-(11.79315)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -3.79069 + (((tickAnim - 26) / 5) * (-6.11608-(-3.79069)));
            yy = 9.22567 + (((tickAnim - 26) / 5) * (-1.69363-(9.22567)));
            zz = 28.04272 + (((tickAnim - 26) / 5) * (21.72877-(28.04272)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -6.11608 + (((tickAnim - 31) / 4) * (-4.74342-(-6.11608)));
            yy = -1.69363 + (((tickAnim - 31) / 4) * (-11.45972-(-1.69363)));
            zz = 21.72877 + (((tickAnim - 31) / 4) * (8.44914-(21.72877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -34.30057 + (((tickAnim - 0) / 18) * (8.13234-(-34.30057)));
            yy = 8.5446 + (((tickAnim - 0) / 18) * (-20.95761-(8.5446)));
            zz = -6.51394 + (((tickAnim - 0) / 18) * (-13.97362-(-6.51394)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 8.13234 + (((tickAnim - 18) / 8) * (0.97147-(8.13234)));
            yy = -20.95761 + (((tickAnim - 18) / 8) * (-6.656-(-20.95761)));
            zz = -13.97362 + (((tickAnim - 18) / 8) * (25.17637-(-13.97362)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0.97147 + (((tickAnim - 26) / 5) * (-13.83316-(0.97147)));
            yy = -6.656 + (((tickAnim - 26) / 5) * (-4.39762-(-6.656)));
            zz = 25.17637 + (((tickAnim - 26) / 5) * (27.47201-(25.17637)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -13.83316 + (((tickAnim - 31) / 4) * (-34.30057-(-13.83316)));
            yy = -4.39762 + (((tickAnim - 31) / 4) * (8.5446-(-4.39762)));
            zz = 27.47201 + (((tickAnim - 31) / 4) * (-6.51394-(27.47201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 39.3818 + (((tickAnim - 0) / 7) * (8.81428-(39.3818)));
            yy = 10.64868 + (((tickAnim - 0) / 7) * (-5.95869-(10.64868)));
            zz = 7.03597 + (((tickAnim - 0) / 7) * (-1.39787-(7.03597)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 8.81428 + (((tickAnim - 7) / 11) * (22.5-(8.81428)));
            yy = -5.95869 + (((tickAnim - 7) / 11) * (0-(-5.95869)));
            zz = -1.39787 + (((tickAnim - 7) / 11) * (0-(-1.39787)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 22.5 + (((tickAnim - 18) / 4) * (95.57-(22.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 95.57 + (((tickAnim - 22) / 4) * (125.25-(95.57)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 125.25 + (((tickAnim - 26) / 9) * (39.3818-(125.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (10.64868-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (7.03597-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.08-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = -0.32 + (((tickAnim - 7) / 11) * (0.35-(-0.32)));
            zz = 0.08 + (((tickAnim - 7) / 11) * (0.2-(0.08)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 18) / 4) * (0.93-(0.35)));
            zz = 0.2 + (((tickAnim - 18) / 4) * (-0.28-(0.2)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.93 + (((tickAnim - 22) / 4) * (0.95-(0.93)));
            zz = -0.28 + (((tickAnim - 22) / 4) * (-0.6-(-0.28)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0.95 + (((tickAnim - 26) / 9) * (0-(0.95)));
            zz = -0.6 + (((tickAnim - 26) / 9) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+30))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+60))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*1));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 49.27696 + (((tickAnim - 0) / 9) * (-5.62704-(49.27696)));
            yy = 23.03113 + (((tickAnim - 0) / 9) * (-4.9613-(23.03113)));
            zz = 14.92932 + (((tickAnim - 0) / 9) * (23.56695-(14.92932)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -5.62704 + (((tickAnim - 9) / 9) * (11.82508-(-5.62704)));
            yy = -4.9613 + (((tickAnim - 9) / 9) * (-33.50881-(-4.9613)));
            zz = 23.56695 + (((tickAnim - 9) / 9) * (-6.83375-(23.56695)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 11.82508 + (((tickAnim - 18) / 17) * (49.27696-(11.82508)));
            yy = -33.50881 + (((tickAnim - 18) / 17) * (23.03113-(-33.50881)));
            zz = -6.83375 + (((tickAnim - 18) / 17) * (14.92932-(-6.83375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 17.52168 + (((tickAnim - 0) / 9) * (-34.43821-(17.52168)));
            yy = -0.41455 + (((tickAnim - 0) / 9) * (8.68604-(-0.41455)));
            zz = 6.36446 + (((tickAnim - 0) / 9) * (-3.30222-(6.36446)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -34.43821 + (((tickAnim - 9) / 9) * (-5-(-34.43821)));
            yy = 8.68604 + (((tickAnim - 9) / 9) * (20.25-(8.68604)));
            zz = -3.30222 + (((tickAnim - 9) / 9) * (0-(-3.30222)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 18) / 17) * (17.52168-(-5)));
            yy = 20.25 + (((tickAnim - 18) / 17) * (-0.41455-(20.25)));
            zz = 0 + (((tickAnim - 18) / 17) * (6.36446-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5.86524 + (((tickAnim - 0) / 3) * (99.50146-(5.86524)));
            yy = -15.14952 + (((tickAnim - 0) / 3) * (-15.06195-(-15.14952)));
            zz = -16.23794 + (((tickAnim - 0) / 3) * (2.56062-(-16.23794)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 99.50146 + (((tickAnim - 3) / 2) * (139.99452-(99.50146)));
            yy = -15.06195 + (((tickAnim - 3) / 2) * (-9.35922-(-15.06195)));
            zz = 2.56062 + (((tickAnim - 3) / 2) * (2.28862-(2.56062)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 139.99452 + (((tickAnim - 5) / 4) * (130.81627-(139.99452)));
            yy = -9.35922 + (((tickAnim - 5) / 4) * (0.14533-(-9.35922)));
            zz = 2.28862 + (((tickAnim - 5) / 4) * (1.83529-(2.28862)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 130.81627 + (((tickAnim - 9) / 5) * (18.43084-(130.81627)));
            yy = 0.14533 + (((tickAnim - 9) / 5) * (3.06873-(0.14533)));
            zz = 1.83529 + (((tickAnim - 9) / 5) * (-9.91372-(1.83529)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 18.43084 + (((tickAnim - 14) / 4) * (12.45358-(18.43084)));
            yy = 3.06873 + (((tickAnim - 14) / 4) * (13.49485-(3.06873)));
            zz = -9.91372 + (((tickAnim - 14) / 4) * (11.25802-(-9.91372)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 12.45358 + (((tickAnim - 18) / 6) * (-18.14342-(12.45358)));
            yy = 13.49485 + (((tickAnim - 18) / 6) * (2.56508-(13.49485)));
            zz = 11.25802 + (((tickAnim - 18) / 6) * (-10.23223-(11.25802)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -18.14342 + (((tickAnim - 24) / 11) * (5.86524-(-18.14342)));
            yy = 2.56508 + (((tickAnim - 24) / 11) * (-15.14952-(2.56508)));
            zz = -10.23223 + (((tickAnim - 24) / 11) * (-16.23794-(-10.23223)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.8-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 9) / 5) * (0.3-(-0.1)));
            zz = -0.8 + (((tickAnim - 9) / 5) * (0-(-0.8)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 14) / 4) * (0-(0.3)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = -0.325 + (((tickAnim - 24) / 11) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 11.82508 + (((tickAnim - 0) / 18) * (49.27696-(11.82508)));
            yy = 33.50881 + (((tickAnim - 0) / 18) * (-23.03113-(33.50881)));
            zz = 6.83375 + (((tickAnim - 0) / 18) * (-14.92932-(6.83375)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 49.27696 + (((tickAnim - 18) / 9) * (-5.62704-(49.27696)));
            yy = -23.03113 + (((tickAnim - 18) / 9) * (4.9613-(-23.03113)));
            zz = -14.92932 + (((tickAnim - 18) / 9) * (-23.56695-(-14.92932)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -5.62704 + (((tickAnim - 27) / 8) * (11.82508-(-5.62704)));
            yy = 4.9613 + (((tickAnim - 27) / 8) * (33.50881-(4.9613)));
            zz = -23.56695 + (((tickAnim - 27) / 8) * (6.83375-(-23.56695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 0) / 18) * (17.52168-(-5)));
            yy = -20.25 + (((tickAnim - 0) / 18) * (0.41455-(-20.25)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.36446-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 17.52168 + (((tickAnim - 18) / 9) * (-34.43821-(17.52168)));
            yy = 0.41455 + (((tickAnim - 18) / 9) * (-8.68604-(0.41455)));
            zz = -6.36446 + (((tickAnim - 18) / 9) * (3.30222-(-6.36446)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -34.43821 + (((tickAnim - 27) / 8) * (-5-(-34.43821)));
            yy = -8.68604 + (((tickAnim - 27) / 8) * (-20.25-(-8.68604)));
            zz = 3.30222 + (((tickAnim - 27) / 8) * (0-(3.30222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 12.45358 + (((tickAnim - 0) / 7) * (-18.14342-(12.45358)));
            yy = -13.49485 + (((tickAnim - 0) / 7) * (-2.56508-(-13.49485)));
            zz = -11.25802 + (((tickAnim - 0) / 7) * (10.23223-(-11.25802)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -18.14342 + (((tickAnim - 7) / 11) * (5.86524-(-18.14342)));
            yy = -2.56508 + (((tickAnim - 7) / 11) * (15.14952-(-2.56508)));
            zz = 10.23223 + (((tickAnim - 7) / 11) * (16.23794-(10.23223)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 5.86524 + (((tickAnim - 18) / 3) * (99.50146-(5.86524)));
            yy = 15.14952 + (((tickAnim - 18) / 3) * (-15.06195-(15.14952)));
            zz = 16.23794 + (((tickAnim - 18) / 3) * (2.56062-(16.23794)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 99.50146 + (((tickAnim - 21) / 2) * (139.99452-(99.50146)));
            yy = -15.06195 + (((tickAnim - 21) / 2) * (-9.35922-(-15.06195)));
            zz = 2.56062 + (((tickAnim - 21) / 2) * (2.28862-(2.56062)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 139.99452 + (((tickAnim - 23) / 4) * (130.81627-(139.99452)));
            yy = -9.35922 + (((tickAnim - 23) / 4) * (0.14533-(-9.35922)));
            zz = 2.28862 + (((tickAnim - 23) / 4) * (1.83529-(2.28862)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 130.81627 + (((tickAnim - 27) / 5) * (18.43084-(130.81627)));
            yy = 0.14533 + (((tickAnim - 27) / 5) * (-3.06873-(0.14533)));
            zz = 1.83529 + (((tickAnim - 27) / 5) * (9.91372-(1.83529)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 18.43084 + (((tickAnim - 32) / 3) * (12.45358-(18.43084)));
            yy = -3.06873 + (((tickAnim - 32) / 3) * (-13.49485-(-3.06873)));
            zz = 9.91372 + (((tickAnim - 32) / 3) * (-11.25802-(9.91372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = -0.325 + (((tickAnim - 7) / 11) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (-0.8-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 27) / 5) * (0.3-(-0.1)));
            zz = -0.8 + (((tickAnim - 27) / 5) * (0-(-0.8)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 32) / 3) * (0-(0.3)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTuditanus e = (EntityPrehistoricFloraTuditanus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
