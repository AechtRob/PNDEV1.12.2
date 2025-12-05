package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGoodrichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelGoodrichthys() {
        this.textureWidth = 95;
        this.textureHeight = 85;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 27.0F, 7.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -12.0F, -14.0F, 8, 9, 18, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 25, 61, 0.0F, -18.0F, -12.75F, 0, 6, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.0F, -14.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 3, -0.5F, -3.0F, 0.25F, 1, 3, 1, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(4.0F, -4.0F, -14.0F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.6109F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 56, 31, 0.0F, 0.0F, 0.0F, 8, 0, 7, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-4.0F, -4.0F, -14.0F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.6109F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 56, 31, -8.0F, 0.0F, 0.0F, 8, 0, 7, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -9.3412F, -13.4141F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 63, 39, -3.5F, -0.6588F, -4.3359F, 7, 6, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 23, 45, -1.5F, 0.3412F, -14.6109F, 3, 3, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 0, -1.5F, 0.8412F, -13.8609F, 3, 3, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 6.3412F, -0.3359F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 11, -1.5F, -2.0F, -4.0F, 6, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5F, 1.8412F, -4.3609F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1963F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 45, 0.5F, 1.0F, -9.0F, 0, 1, 5, -0.001F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 56, 0.0F, -1.5F, -10.0F, 2, 3, 10, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.5F, 1.8412F, -4.3609F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1963F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 45, -0.5F, 1.0F, -9.0F, 0, 1, 5, -0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 56, -2.0F, -1.5F, -10.0F, 2, 3, 10, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.9588F, -4.5859F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 56, -2.5F, 0.0052F, -4.9392F, 5, 3, 5, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 61, 65, -1.5F, 0.0052F, -10.9392F, 3, 3, 6, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -2.6588F, -0.5859F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 71, -1.5F, 0.0F, -4.0F, 6, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.3413F, -4.3281F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 18, -1.5F, -0.0001F, -10.0078F, 3, 2, 10, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 60, -2.5F, -2.0001F, -3.0078F, 5, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 11, 13, -1.5F, -0.5001F, -9.2578F, 3, 2, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 2.4249F, -2.9828F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 28, -0.5F, -2.0622F, -4.9787F, 3, 2, 5, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 2.9999F, 3.9922F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 72, 50, -1.5F, -2.0F, -7.0F, 5, 2, 3, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.5F, -1.5001F, -0.0328F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1963F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 73, 0, 0.5F, 1.0F, -9.0F, 0, 1, 5, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 1, 0.0F, 1.5F, -10.0F, 2, 2, 10, -0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.5F, -1.5001F, -0.0328F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1963F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 73, 0, -0.5F, 1.0F, -9.0F, 0, 1, 5, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 1, -2.0F, 1.5F, -10.0F, 2, 2, 10, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -9.8683F, 3.5785F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 23, 28, -3.5F, -1.6317F, -0.5785F, 7, 7, 9, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -7.6317F, 2.6215F, 0, 6, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.6317F, 1.4215F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, -3.0F, 0.2F, 1, 3, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.3683F, 0.4215F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 45, -3.0F, -1.0F, -1.0F, 6, 1, 9, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(3.4676F, 4.8852F, 0.4215F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.6109F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 35, 0, 0.0F, 0.0F, 0.0F, 6, 0, 10, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-3.4676F, 4.8852F, 0.4215F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.6109F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 35, 0, -6.0F, 0.0F, 0.0F, 6, 0, 10, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.8683F, 7.9215F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 57, -2.5F, -3.0F, -0.5F, 5, 6, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7559F, 5.9693F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 64, 14, -2.0F, -1.7441F, -0.4693F, 4, 4, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 47, 31, 2.0F, 0.2559F, 0.5307F, 2, 0, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 47, 31, -4.0F, 0.2559F, 0.5307F, 2, 0, 5, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 1.9059F, 0.6307F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 29, 2.0F, -0.4F, 0.75F, 0, 5, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1191F, 5.5307F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 44, 70, -1.0F, -1.125F, -1.0F, 2, 3, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 13, 1.025F, 0.375F, 0.0F, 3, 0, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 13, -4.0F, 0.375F, 0.0F, 3, 0, 4, 0.0F, true));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 28, 0.0F, -7.625F, 1.0F, 0, 17, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

        //Rotations, positions and sizing:
        this.main.offsetY = -0.55F;
        this.main.offsetX = 0.0F;
        this.main.rotateAngleY = (float)Math.toRadians(-68);
        this.main.rotateAngleX = (float)Math.toRadians(15);
        this.main.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 0.6F;
        this.main.scaleChildren = true;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.main.offsetX = -0.01F;
        this.main.offsetZ = -0.2F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.15F, 0.0F, 0.1F);
        this.setRotateAngle(tail, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.3F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
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

        //this.root.offsetY = -0.5F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontleftfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontleftfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontrightfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontrightfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);
        this.flap(backleftfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.flap(backrightfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetX = -0.5F;
            this.main.offsetY = -0.5F;
            this.bob(main, -speed * 3.9F, 1.2F, false, f2, 1);
            this.chainWave(fishTail, speed * 2.6F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 2.6F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

