package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPantylus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPantylus extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended Pantylus;
    private final AdvancedModelRendererExtended Cephalon;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended Body1;
    private final AdvancedModelRendererExtended ForelimbR;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Radio_UlnaR;
    private final AdvancedModelRendererExtended ManusR;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended ForelimbL;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended Radio_UlnaL;
    private final AdvancedModelRendererExtended ManusL;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended HindlimbR;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended Tibia_FibulaR;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended PesR;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended HindlimbL;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended Tibia_FibulaL;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended PesL;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended Body3;
    private final AdvancedModelRendererExtended body4;
    private final AdvancedModelRendererExtended Body5;
    private final AdvancedModelRendererExtended Body6;

    private ModelAnimator animator;

    public ModelPantylus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Pantylus = new AdvancedModelRendererExtended(this);
        this.Pantylus.setRotationPoint(0.0F, 26.0F, 0.0F);


        this.Body1 = new AdvancedModelRendererExtended(this);
        this.Body1.setRotationPoint(0.0F, -6.0F, -4.0F);
        this.Pantylus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.0F, -1.0F, 0.0F, 7, 4, 6, 0.0F, false));

        this.Cephalon = new AdvancedModelRendererExtended(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 11, -2.0F, -1.0F, -4.0F, 5, 3, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 21, 0, -2.5F, -0.9F, -3.7F, 6, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 19, 11, -2.0F, 2.0F, -3.0F, 5, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 24, -1.5F, 0.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2967F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 8, -1.5F, -1.0F, -0.6F, 4, 1, 1, -0.01F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.Cephalon.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 24, 24, -1.5F, 0.0F, -1.6F, 4, 1, 2, -0.02F, false));

        this.ForelimbR = new AdvancedModelRendererExtended(this);
        this.ForelimbR.setRotationPoint(-3.0F, 1.7F, 1.5F);
        this.Body1.addChild(ForelimbR);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ForelimbR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.1396F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 3, -2.0F, -0.4F, -0.5F, 2, 1, 1, 0.0F, false));

        this.Radio_UlnaR = new AdvancedModelRendererExtended(this);
        this.Radio_UlnaR.setRotationPoint(-2.0F, 0.4F, 0.0F);
        this.ForelimbR.addChild(Radio_UlnaR);
        this.setRotateAngle(Radio_UlnaR, -0.3491F, 0.0F, 0.0F);
        this.Radio_UlnaR.cubeList.add(new ModelBox(Radio_UlnaR, 24, 33, -0.2F, -0.4F, -0.5F, 1, 2, 1, 0.0F, false));

        this.ManusR = new AdvancedModelRendererExtended(this);
        this.ManusR.setRotationPoint(0.3F, 1.6F, 0.0F);
        this.Radio_UlnaR.addChild(ManusR);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ManusR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3665F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 20, -0.9F, -0.6F, -1.5F, 2, 1, 2, 0.0F, false));

        this.ForelimbL = new AdvancedModelRendererExtended(this);
        this.ForelimbL.setRotationPoint(4.0F, 1.7F, 1.5F);
        this.Body1.addChild(ForelimbL);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ForelimbL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.1396F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 29, 0.0F, -0.4F, -0.5F, 2, 1, 1, 0.0F, false));

        this.Radio_UlnaL = new AdvancedModelRendererExtended(this);
        this.Radio_UlnaL.setRotationPoint(2.0F, 0.4F, 0.0F);
        this.ForelimbL.addChild(Radio_UlnaL);
        this.setRotateAngle(Radio_UlnaL, -0.3491F, 0.0F, 0.0F);
        this.Radio_UlnaL.cubeList.add(new ModelBox(Radio_UlnaL, 0, 0, -0.8F, -0.4F, -0.5F, 1, 2, 1, 0.0F, false));

        this.ManusL = new AdvancedModelRendererExtended(this);
        this.ManusL.setRotationPoint(-0.3F, 1.6F, 0.0F);
        this.Radio_UlnaL.addChild(ManusL);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ManusL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3665F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 16, -1.1F, -0.6F, -1.5F, 2, 1, 2, 0.0F, false));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body1.addChild(Body2);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 16, -2.0F, -1.0F, -0.1F, 5, 4, 3, 0.0F, false));

        this.HindlimbR = new AdvancedModelRendererExtended(this);
        this.HindlimbR.setRotationPoint(-1.6F, 2.0F, 1.8F);
        this.Body2.addChild(HindlimbR);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HindlimbR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.6981F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 28, -1.0F, -0.4F, -2.5F, 1, 1, 3, 0.0F, false));

        this.Tibia_FibulaR = new AdvancedModelRendererExtended(this);
        this.Tibia_FibulaR.setRotationPoint(-2.0F, 0.0F, -1.5F);
        this.HindlimbR.addChild(Tibia_FibulaR);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tibia_FibulaR.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.909F, -0.3673F, -1.298F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 3, -1.7F, -0.4F, -0.5F, 2, 1, 1, 0.0F, false));

        this.PesR = new AdvancedModelRendererExtended(this);
        this.PesR.setRotationPoint(0.0F, 1.8F, -0.1F);
        this.Tibia_FibulaR.addChild(PesR);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PesR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.9599F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 33, -2.0F, -0.8F, -1.0F, 2, 1, 2, 0.0F, false));

        this.HindlimbL = new AdvancedModelRendererExtended(this);
        this.HindlimbL.setRotationPoint(2.6F, 2.0F, 1.8F);
        this.Body2.addChild(HindlimbL);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HindlimbL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, -0.6981F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 3, 0.0F, -0.4F, -2.5F, 1, 1, 3, 0.0F, false));

        this.Tibia_FibulaL = new AdvancedModelRendererExtended(this);
        this.Tibia_FibulaL.setRotationPoint(2.0F, 0.0F, -1.5F);
        this.HindlimbL.addChild(Tibia_FibulaL);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tibia_FibulaL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.909F, 0.3673F, 1.298F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 11, -0.3F, -0.4F, -0.5F, 2, 1, 1, 0.0F, false));

        this.PesL = new AdvancedModelRendererExtended(this);
        this.PesL.setRotationPoint(0.0F, 1.8F, -0.1F);
        this.Tibia_FibulaL.addChild(PesL);


        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PesL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.9599F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 32, 0.0F, -0.8F, -1.0F, 2, 1, 2, 0.0F, false));

        this.Body3 = new AdvancedModelRendererExtended(this);
        this.Body3.setRotationPoint(0.0F, -0.3F, 2.9F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, -0.1309F, 0.0F, 0.0F);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 19, -1.5F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

        this.body4 = new AdvancedModelRendererExtended(this);
        this.body4.setRotationPoint(0.0F, -0.3F, 2.7F);
        this.Body3.addChild(body4);
        this.setRotateAngle(body4, -0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 25, -1.0F, 1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.Body5 = new AdvancedModelRendererExtended(this);
        this.Body5.setRotationPoint(0.0F, 2.1F, 2.9F);
        this.body4.addChild(Body5);
        this.setRotateAngle(Body5, -0.0436F, 0.0F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 30, 28, -0.5F, -1.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Body6 = new AdvancedModelRendererExtended(this);
        this.Body6.setRotationPoint(0.5F, -0.4F, 0.0F);
        this.Body5.addChild(Body6);
        this.setRotateAngle(Body6, -0.0698F, 0.0F, 0.0F);
        this.Body6.cubeList.add(new ModelBox(Body6, 8, 29, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Pantylus.render(f5 * 0.3f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Pantylus.offsetZ = -0.2F;
        this.Pantylus.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
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
        this.Pantylus.offsetY = 1.05F;

        EntityPrehistoricFloraPantylus EntitiyPantylus = (EntityPrehistoricFloraPantylus) e;

        this.faceTarget(f3, f4, 12, Cephalon);

        float speed = 0.385F;
        if (EntitiyPantylus.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.Body3, this.body4, this.Body5, this.Body6};
        AdvancedModelRenderer[] Torso = {this.Body1, this.Body2};

        if (!EntitiyPantylus.isReallyInWater()) {

            if (f3 == 0.0F || !EntitiyPantylus.getIsMoving()) { //Not moving
                return;
            }

            this.flap(HindlimbL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(HindlimbL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(Tibia_FibulaL, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(PesL, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(HindlimbR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(HindlimbR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(Tibia_FibulaR, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(PesR, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(ForelimbL, speed, 0.35F, false, 3, -0.1F, f2, 0.5F);
            this.walk(Radio_UlnaL, speed, -0.4F, false, 4, 0.15F, f2, 0.8F);
            this.walk(ManusL, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(ForelimbR, speed, -0.35F, false, 0, 0.1F, f2, 0.5F);
            this.walk(Radio_UlnaR, speed, -0.4F, false, 1, 0.15F, f2, 0.8F);
            this.walk(ManusR, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.08F, -0.16, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.08F, -0.16, f2, 0.7F);
            this.bob(Pantylus, speed*2, 0.11F, false, f2, 1F);

            this.Pantylus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.45), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            //Feet:
            this.ManusL.rotateAngleY = (float) Math.toRadians(-50);
            this.ManusR.rotateAngleY = (float) Math.toRadians(50);
            this.PesL.rotateAngleZ = (float) Math.toRadians(-50);
            this.PesR.rotateAngleZ = (float) Math.toRadians(50);

            this.ForelimbL.rotateAngleX= (float) Math.toRadians(40);
            this.ForelimbR.rotateAngleX= (float) Math.toRadians(-40);
            this.HindlimbL.rotateAngleZ= (float) Math.toRadians(25);
            this.HindlimbR.rotateAngleZ= (float) Math.toRadians(-25);

            this.Tibia_FibulaL.rotateAngleX= (float) Math.toRadians(17.5);
            this.Tibia_FibulaR.rotateAngleX= (float) Math.toRadians(-17.5);

            AdvancedModelRenderer[] BackL = {this.Tibia_FibulaL, this.PesL};
            AdvancedModelRenderer[] BackR = {this.Tibia_FibulaR, this.PesR};

            this.flap(HindlimbL, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(HindlimbR, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(ForelimbL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(ForelimbL, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(Radio_UlnaL, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(ManusL, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(ForelimbR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(ForelimbR, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(Radio_UlnaR, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(ManusR, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -0.16, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.16, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.16, f2, 0.7F);
        }
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPantylus e = (EntityPrehistoricFloraPantylus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.Cephalon, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.Cephalon, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
