package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGymnotrachelus extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelGymnotrachelus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.297F, -3.5305F);
        this.main.cubeList.add(new ModelBox(main, 14, 18, -3.0F, -3.497F, 0.2805F, 6, 6, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 22, 32, -2.5F, -3.497F, -4.7195F, 5, 5, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.503F, 0.2805F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2094F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 27, -2.0F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.625F, 0.3739F, -2.866F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -0.9599F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.1618F, 0.1504F, 3.3465F);
        this.frontleftfin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 38, 2.0F, -1.75F, -4.75F, 0, 7, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.625F, 0.3739F, -2.866F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 1.0036F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.1618F, 0.1504F, 3.3465F);
        this.frontrightfin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 38, -2.0F, -1.75F, -4.75F, 0, 7, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.1599F, -8.4731F);
        this.main.addChild(head);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.7764F, -0.275F, -1.4888F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, -0.7F, -0.475F, -1.325F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.7764F, -0.275F, -1.4888F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 3, -0.3F, -0.475F, -1.325F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 1.9477F, 1.9425F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3797F, -0.1501F, 0.0596F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.2F, -1.3559F, -3.1828F, 1, 1, 2, 0.001F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 1.9477F, 1.9425F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3797F, 0.1501F, -0.0596F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.2F, -1.3559F, -3.1828F, 1, 1, 2, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 1.9477F, 1.1425F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3828F, -0.1947F, 0.0777F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 4, 0.3665F, -0.3741F, -5.4032F, 0, 1, 4, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 44, -0.1335F, -0.6491F, -5.2532F, 1, 1, 5, 0.001F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, 1.9477F, 1.1425F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3828F, 0.1947F, -0.0777F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 4, -0.3665F, -0.3741F, -5.4032F, 0, 1, 4, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 44, -0.8665F, -0.6491F, -5.2532F, 1, 1, 5, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3752F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 40, -1.0F, -0.725F, -5.3F, 2, 1, 6, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.2052F, -1.2313F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1658F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 8, -1.0F, 0.9236F, -1.1384F, 2, 1, 1, -0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 45, -1.0F, -0.0014F, -3.0134F, 2, 1, 3, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.3371F, 3.7536F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0262F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 6, 8, -1.0F, 2.0F, -4.15F, 2, 1, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 46, -1.0F, 0.0F, -5.0F, 2, 2, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 0, -2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.6256F, 3.7469F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1178F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 42, 23, -1.5F, -0.9893F, -2.9994F, 3, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.2561F, 0.7791F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, 0.0393F, 0.3105F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3513F, -0.1107F, 0.0405F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 4, 0.6F, -0.237F, -5.0845F, 0, 1, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 45, 0.425F, 0.013F, -5.0345F, 1, 1, 5, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.0F, 0.0393F, 0.3105F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3513F, 0.1107F, -0.0405F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 4, -0.6F, -0.237F, -5.0845F, 0, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 45, -1.425F, 0.013F, -5.0345F, 1, 1, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.8193F, 0.1495F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3491F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 9, -1.0F, -0.775F, -5.45F, 2, 1, 1, -0.001F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 26, -1.0F, -0.775F, -5.025F, 2, 1, 5, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.8214F, 8.2259F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 22, 0, -2.5F, -0.1756F, -0.9455F, 5, 5, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.6756F, 0.0545F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0698F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 5, 0.0F, -4.0F, 0.0F, 0, 4, 8, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 32, -2.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 5.3244F, 0.0545F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0698F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -2.0F, -1.0F, 0.0F, 4, 1, 7, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.5F, 4.5744F, 1.5545F);
        this.body.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.1309F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.backleftfin.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3054F, 0.0F, -1.0908F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 29, -0.7F, -0.9F, -1.5F, 0, 5, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.5F, 4.5744F, 1.5545F);
        this.body.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.2618F, -0.1309F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.backrightfin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 1.0908F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 29, 0.7F, -0.9F, -1.5F, 0, 5, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 3.2066F, 6.6475F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 34, 13, -2.0F, -2.8822F, -0.593F, 4, 4, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 3.3211F, 3.5849F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2705F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 28, 0.0F, -2.7F, -2.0F, 0, 4, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.6178F, 0.407F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.096F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 0, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -3.3822F, 0.407F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.096F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 40, -1.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.8822F, 5.407F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 36, -1.0F, -1.5F, -1.0F, 2, 3, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, 0.0F, -7.25F, 0.0F, 0, 15, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.14F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


        AdvancedModelRenderer[] fishTail = {this.body, this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.2F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontleftfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontleftfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontrightfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontrightfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backleftfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backleftfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backrightfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backrightfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

