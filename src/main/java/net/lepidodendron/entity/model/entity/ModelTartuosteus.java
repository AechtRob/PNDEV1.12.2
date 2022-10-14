package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTartuosteus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTartuosteus extends AdvancedModelBase {
    private final AdvancedModelRenderer Tartuosteus;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;

    private ModelAnimator animator;

    public ModelTartuosteus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Tartuosteus = new AdvancedModelRenderer(this);
        this.Tartuosteus.setRotationPoint(0.0F, 18.0F, -5.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.Tartuosteus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 33, 30, -3.0F, -3.0F, -7.0F, 6, 8, 12, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 51, 71, -2.0F, -3.0F, -11.0F, 4, 6, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -5.0F, -3.2F, -9.0F, 10, 2, 14, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 17, 17, -6.0F, -3.0F, -5.0F, 12, 2, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-14.0F, -1.0F, 1.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0713F, -1.1066F, -0.2792F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 69, 0, -1.7F, -1.0F, -2.0284F, 2, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(14.0F, -1.0F, 1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0713F, 1.1066F, 0.2792F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 10, -0.3F, -1.0F, -2.0284F, 2, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-8.0F, -3.0F, -3.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.025F, -0.9845F, -0.1431F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 62, -1.6F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(8.0F, -3.0F, -3.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.025F, 0.9845F, 0.1431F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 61, 62, -2.4F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(5.0F, -3.0F, -9.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0083F, 0.6901F, 0.0679F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 51, -3.8F, 0.0F, 0.4F, 4, 2, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-5.4F, -3.0F, -9.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0083F, -0.6901F, -0.0679F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 51, 0.2F, 0.0F, 0.2F, 4, 2, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, -3.0F, -11.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.576F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, 0.0F, 0.0F, 4, 2, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, -3.0F, -11.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.576F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 5, -4.0F, 0.0F, 0.0F, 4, 2, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(14.0F, -3.0F, 3.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.2094F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 23, 4.0F, 1.0F, -1.0F, 2, 2, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 71, 0.0F, 1.0F, -2.0F, 4, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-14.0F, -3.0F, 3.0F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2094F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 17, -6.0F, 1.0F, -1.0F, 2, 2, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 73, -4.0F, 1.0F, -2.0F, 4, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(10.0F, -3.0F, 1.0F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.1571F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 67, 0.0F, 0.4F, -2.0F, 4, 2, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-10.0F, -3.0F, 1.0F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.1571F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 67, 45, -4.0F, 0.4F, -2.0F, 4, 2, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(6.0F, -3.0F, 1.0F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.1047F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 52, 5, 0.0F, 0.0F, -4.0F, 4, 2, 8, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-6.0F, -3.0F, 1.0F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.1047F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 16, -4.0F, 0.0F, -4.0F, 4, 2, 8, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 58, 27, -3.0F, -3.0F, 0.0F, 6, 8, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 35, 0, -3.0F, -1.6F, 0.0F, 6, 6, 6, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 48, -2.0F, -1.6F, 0.0F, 4, 6, 8, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 19, 62, -2.0F, -1.2F, 0.0F, 4, 4, 6, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 34, 71, -1.0F, -1.2F, -1.0F, 2, 4, 6, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 17, 0.0F, -6.0F, 1.0F, 0, 14, 16, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Tartuosteus.render(f5 * 0.4f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Tartuosteus.rotateAngleY = (float) Math.toRadians(60.3);
        this.Tartuosteus.rotateAngleX = (float) Math.toRadians(-30);
        this.Tartuosteus.rotateAngleZ = (float) Math.toRadians(-26);
        this.Body2.rotateAngleY = (float) Math.toRadians(7.5);
        this.Body3.rotateAngleY = (float) Math.toRadians(12.5);
        this.Body4.rotateAngleY = (float) Math.toRadians(20);
        this.Body5.rotateAngleY = (float) Math.toRadians(27.5);
        this.Tartuosteus.offsetX = -0.09F;
        this.Tartuosteus.offsetY = -0.19F;
        this.Tartuosteus.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Tartuosteus.offsetY = 0.9F;

        EntityPrehistoricFloraTartuosteus EntityTartuosteus = (EntityPrehistoricFloraTartuosteus) e;

        this.faceTarget(f3, f4, 2, Tartuosteus);

        float angleTail = 0F;
        int tailTicks = EntityTartuosteus.getTailTicks();
        if (tailTicks > 50) {
            angleTail = (float) (0.4D * Math.sin(((((double)tailTicks - 50D) / 40D) * (Math.PI/90) * 360D)));
        }

        AdvancedModelRenderer[] Tail = {this.Body2, this.Body3, this.Body4, this.Body5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (EntityTartuosteus.getIsFeeding()) {
                float speed = 0.15F;
                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed, 0.2F, -1.5, f2, 1);
            }
            if (!e.isInWater()) {
                float speed = 0.72F;
                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed, 0.2F, -1.5, f2, 1);
                this.bob(Tartuosteus, -speed, 5F, false, f2, 1);
            }
            else if (tailTicks > 50) {
                this.Tartuosteus.rotateAngleY = -angleTail * 0.4F;
                this.Body2.rotateAngleY = angleTail;
                this.Body3.rotateAngleY = angleTail * 0.8F;
                this.Body4.rotateAngleY = angleTail * 0.6F;
                this.Body5.rotateAngleY = angleTail * 0.4F;
            }
            else {
                this.chainSwing(Tail, 0.1F, 0.1F, -1, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTartuosteus e = (EntityPrehistoricFloraTartuosteus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FEED_ANIMATION); //duration 100
        
        animator.resetKeyframe(10);

    }
}
