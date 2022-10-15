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

public class ModelOrnithoprion extends AdvancedModelBase {
    private final AdvancedModelRenderer ornithoprion;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pectoralL;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralL2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer whorl;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelOrnithoprion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.ornithoprion = new AdvancedModelRenderer(this);
        this.ornithoprion.setRotationPoint(0.0F, 24.0F, 0.025F);
        this.ornithoprion.cubeList.add(new ModelBox(ornithoprion, 8, 12, -2.0F, -4.25F, 3.0F, 4, 4, 6, 0.0F, false));
        this.ornithoprion.cubeList.add(new ModelBox(ornithoprion, 8, 4, 0.05F, -3.575F, -2.025F, 1, 1, 1, 0.0F, false));
        this.ornithoprion.cubeList.add(new ModelBox(ornithoprion, 8, 4, -1.05F, -3.575F, -2.025F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.ornithoprion.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1571F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 0, -1.5F, -1.0F, -4.0F, 3, 1, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.6723F, -4.6055F);
        this.ornithoprion.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 3, -1.0F, -1.8979F, -0.8807F, 2, 1, 1, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.875F, -2.8F);
        this.ornithoprion.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 29, -1.0F, -0.425F, -1.5F, 2, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.875F, -1.05F);
        this.ornithoprion.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 29, -1.0F, 0.0F, -4.375F, 2, 1, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.55F, -4.8F);
        this.ornithoprion.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0393F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -0.1219F, -3.0109F, 1, 1, 2, 0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 2, -1.0F, -0.1219F, -1.0109F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.25F, 3.0F);
        this.ornithoprion.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 22, -1.5F, 0.0F, -4.0F, 3, 3, 4, 0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.25F, 7.25F);
        this.ornithoprion.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 16, 0.0F, -2.0F, -3.0F, 0, 4, 6, 0.0F, false));

        this.pectoralL = new AdvancedModelRenderer(this);
        this.pectoralL.setRotationPoint(2.0F, -0.75F, 4.0F);
        this.ornithoprion.addChild(pectoralL);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.pectoralL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1702F, 0.0F, -1.1345F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 4, 0.0F, 0.0F, -1.25F, 0, 3, 5, 0.0F, false));

        this.pectoralL2 = new AdvancedModelRenderer(this);
        this.pectoralL2.setRotationPoint(-2.0F, -0.75F, 4.0F);
        this.ornithoprion.addChild(pectoralL2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.pectoralL2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1702F, 0.0F, 1.1345F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 4, 0.0F, 0.0F, -1.25F, 0, 3, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.938F, -0.8373F);
        this.ornithoprion.addChild(jaw);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.2657F, -3.7682F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0087F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, -1.0377F, -6.7307F, 1, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.2657F, -3.7682F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 0, -1.0F, -0.9229F, -0.8807F, 2, 1, 1, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.937F, -1.9627F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 17, -1.0F, 0.575F, -1.55F, 2, 1, 4, 0.0F, false));

        this.whorl = new AdvancedModelRenderer(this);
        this.whorl.setRotationPoint(0.0F, -0.3838F, -3.2545F);
        this.jaw.addChild(whorl);
        this.setRotateAngle(whorl, -0.1745F, 0.0F, 0.0F);
        this.whorl.cubeList.add(new ModelBox(whorl, 8, 32, 0.0F, -1.0F, -0.8F, 0, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.25F, 8.5F);
        this.ornithoprion.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 14, 0, -1.5F, -2.0F, 0.0F, 3, 4, 5, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 9, -1.0F, -1.5F, -0.5F, 2, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 22, -0.5F, -1.0F, -0.5F, 1, 2, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 5.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -5.5F, 0.0F, 0, 11, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.ornithoprion.render(f5 * 0.342F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.ornithoprion.rotateAngleY = (float) Math.toRadians(90);
        this.ornithoprion.offsetX = -0.09F;
        this.ornithoprion.offsetY = -0.2F;
        this.ornithoprion.render(0.01F);
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

        this.ornithoprion.offsetY = 1.0F;

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
            this.swing(ornithoprion, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(ornithoprion, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralL, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralL2, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralL2, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.ornithoprion.rotateAngleZ = (float) Math.toRadians(90);
            this.ornithoprion.offsetY = 1.05F;
            this.bob(ornithoprion, -speed * 1.9F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

