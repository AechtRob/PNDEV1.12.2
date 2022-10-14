package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelLonchidion extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralR;
    private final AdvancedModelRenderer pectoralL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer pelvicR;
    private final AdvancedModelRenderer pelvicL;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;

    private ModelAnimator animator;

    public ModelLonchidion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 17.0F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 18, 0, -2.0F, 0.75F, -4.0F, 4, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 7.5F, 4.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 0, -1.5F, -8.025F, -6.55F, 3, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 28, 13, -1.5F, -1.25F, -3.0F, 3, 2, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, -0.0873F, 0.2618F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.5F, -0.75F, -0.25F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0873F, -0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.5F, -0.75F, -0.25F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 27, -1.5F, -1.6F, -3.25F, 3, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.75F, 0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 30, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -3.0F, 0.0F, 5, 5, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 21, 0.0F, -7.0F, 1.0F, 0, 4, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6981F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 33, -0.5F, -4.75F, -0.25F, 1, 5, 1, 0.0F, false));

        this.pectoralR = new AdvancedModelRenderer(this);
        this.pectoralR.setRotationPoint(-2.5F, 0.0F, 2.0F);
        this.body2.addChild(pectoralR);
        this.setRotateAngle(pectoralR, 0.1745F, 0.0F, 0.7854F);
        this.pectoralR.cubeList.add(new ModelBox(pectoralR, 26, 4, 0.0F, 0.0F, -1.0F, 0, 5, 4, 0.0F, false));

        this.pectoralL = new AdvancedModelRenderer(this);
        this.pectoralL.setRotationPoint(2.5F, 0.0F, 2.0F);
        this.body2.addChild(pectoralL);
        this.setRotateAngle(pectoralL, 0.1745F, 0.0F, -0.7854F);
        this.pectoralL.cubeList.add(new ModelBox(pectoralL, 26, 4, 0.0F, 0.0F, -1.0F, 0, 5, 4, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.0F, 8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 13, -2.0F, -1.5F, -1.0F, 4, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 16, 17, 0.0F, -5.0F, 1.25F, 0, 4, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.5F, 2.0F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6109F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 30, -0.5F, -4.25F, -0.25F, 1, 5, 1, 0.0F, false));

        this.pelvicR = new AdvancedModelRenderer(this);
        this.pelvicR.setRotationPoint(-1.0F, 2.5F, 1.0F);
        this.body3.addChild(pelvicR);
        this.setRotateAngle(pelvicR, 0.0F, 0.0F, 0.6981F);
        this.pelvicR.cubeList.add(new ModelBox(pelvicR, 0, 0, 0.0F, -0.5F, -1.0F, 0, 3, 4, 0.0F, false));

        this.pelvicL = new AdvancedModelRenderer(this);
        this.pelvicL.setRotationPoint(1.0F, 2.5F, 1.0F);
        this.body3.addChild(pelvicL);
        this.setRotateAngle(pelvicL, 0.0F, 0.0F, -0.6981F);
        this.pelvicL.cubeList.add(new ModelBox(pelvicL, 0, 0, 0.0F, -0.5F, -1.0F, 0, 3, 4, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 19, -1.5F, -1.5F, -1.0F, 3, 3, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 28, 0.0F, 1.0F, -1.0F, 0, 3, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 23, 23, -1.0F, -1.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body5.addChild(tail);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, 0.0F, -3.5F, -1.0F, 0, 6, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.342F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.head.rotateAngleX = (float) Math.toRadians(-15);
        this.body.rotateAngleX = (float) Math.toRadians(0);
        this.body2.rotateAngleX = (float) Math.toRadians(-10);
        this.body3.rotateAngleX = (float) Math.toRadians(5);
        this.body4.rotateAngleX = (float) Math.toRadians(7.5);
        this.body5.rotateAngleX = (float) Math.toRadians(7.5);
        this.tail.rotateAngleX = (float) Math.toRadians(10);
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.body.offsetX = -0.09F;
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
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

        this.body.offsetY = 1.05F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.tail};

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
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralL, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralR, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralR, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicL, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicL, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicR, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicR, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.1F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

