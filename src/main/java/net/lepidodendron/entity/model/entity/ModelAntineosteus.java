package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAntineosteus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelAntineosteus extends AdvancedModelBase {
    private final AdvancedModelRenderer Antineosteus;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Bodysegment1;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer EyeL_r1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Palate_r1;
    private final AdvancedModelRenderer Palate_r2;
    private final AdvancedModelRenderer Palate_r3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer PectoralfinL;
    private final AdvancedModelRenderer PectoralfinR;
    private final AdvancedModelRenderer Bodysegment2;
    private final AdvancedModelRenderer Bodysegment3;
    private final AdvancedModelRenderer AnalfinR;
    private final AdvancedModelRenderer AnalfinL;
    private final AdvancedModelRenderer Bodysegment4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Bodysegment5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Bodysegment6;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Bodysegment7;
    private final AdvancedModelRenderer Bodysegment8;
    private final AdvancedModelRenderer cube_r10;

    private ModelAnimator animator;


    public ModelAntineosteus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Antineosteus = new AdvancedModelRenderer(this);
        this.Antineosteus.setRotationPoint(0.0F, 19.0F, -5.0F);


        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.Antineosteus.addChild(Body);


        this.Bodysegment1 = new AdvancedModelRenderer(this);
        this.Bodysegment1.setRotationPoint(-1.0F, -14.0F, 0.0F);
        this.Body.addChild(Bodysegment1);
        this.Bodysegment1.cubeList.add(new ModelBox(Bodysegment1, 27, 0, -7.0F, -7.0F, 0.0F, 14, 9, 12, 0.01F, false));

        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(-1.0F, -1.9F, 0.6F);
        this.Bodysegment1.addChild(Cephalon);
        this.setRotateAngle(Cephalon, 0.1309F, 0.0F, 0.0F);


        this.EyeL_r1 = new AdvancedModelRenderer(this);
        this.EyeL_r1.setRotationPoint(2.0F, 14.0F, 0.0F);
        this.Cephalon.addChild(EyeL_r1);
        this.setRotateAngle(EyeL_r1, 0.2356F, 0.0F, 0.0F);
        this.EyeL_r1.cubeList.add(new ModelBox(EyeL_r1, 9, 0, 1.8F, -18.4F, -8.9F, 2, 2, 2, 0.0F, false));
        this.EyeL_r1.cubeList.add(new ModelBox(EyeL_r1, 16, 3, -5.8F, -18.4F, -8.9F, 2, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 1.0F, -13.4F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 40, -5.0F, -1.4F, -1.6F, 8, 2, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -2.0F, -12.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4189F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 59, -5.0F, -0.4F, -4.0F, 8, 2, 4, 0.0F, false));

        this.Palate_r1 = new AdvancedModelRenderer(this);
        this.Palate_r1.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(Palate_r1);
        this.setRotateAngle(Palate_r1, -0.0087F, 0.0F, 0.0F);
        this.Palate_r1.cubeList.add(new ModelBox(Palate_r1, 39, 23, -6.0F, -0.1981F, -13.9128F, 10, 2, 14, 0.01F, false));

        this.Palate_r2 = new AdvancedModelRenderer(this);
        this.Palate_r2.setRotationPoint(8.0F, 1.0F, -14.0F);
        this.Cephalon.addChild(Palate_r2);
        this.setRotateAngle(Palate_r2, -0.0088F, 0.1396F, -0.0012F);
        this.Palate_r2.cubeList.add(new ModelBox(Palate_r2, 78, 70, -3.99F, -2.1102F, -0.332F, 2, 2, 14, 0.01F, false));

        this.Palate_r3 = new AdvancedModelRenderer(this);
        this.Palate_r3.setRotationPoint(-4.0F, 1.0F, -14.0F);
        this.Cephalon.addChild(Palate_r3);
        this.setRotateAngle(Palate_r3, -0.0088F, -0.1396F, 0.0012F);
        this.Palate_r3.cubeList.add(new ModelBox(Palate_r3, 79, 53, 0.01F, -2.1102F, -0.132F, 2, 2, 14, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, -4.1F, 0.4F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1833F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 66, -6.0F, -0.9702F, -12.7707F, 10, 4, 13, -0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 2.0F, -6.0F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 70, 87, -4.99F, -0.89F, -0.01F, 10, 2, 6, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(1.0F, 2.2F, -5.6F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0611F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -0.3208F, -0.0938F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 86, 36, -6.01F, -0.81F, -7.99F, 10, 2, 8, -0.01F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(7.0F, 1.4F, 4.0F);
        this.Bodysegment1.addChild(PectoralfinL);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 45, 40, 0.0F, 0.0F, -4.0F, 14, 0, 12, 0.0F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-7.0F, 1.4F, 6.0F);
        this.Bodysegment1.addChild(PectoralfinR);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 33, 53, -14.0F, 0.0F, -6.0F, 14, 0, 12, 0.0F, false));

        this.Bodysegment2 = new AdvancedModelRenderer(this);
        this.Bodysegment2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Bodysegment1.addChild(Bodysegment2);
        this.Bodysegment2.cubeList.add(new ModelBox(Bodysegment2, 0, 66, -6.01F, -7.01F, 0.01F, 12, 9, 10, -0.01F, false));

        this.Bodysegment3 = new AdvancedModelRenderer(this);
        this.Bodysegment3.setRotationPoint(0.0F, 0.0F, 8.8F);
        this.Bodysegment2.addChild(Bodysegment3);
        this.Bodysegment3.cubeList.add(new ModelBox(Bodysegment3, 0, 37, -5.02F, -7.02F, 0.02F, 10, 9, 12, -0.03F, false));

        this.AnalfinR = new AdvancedModelRenderer(this);
        this.AnalfinR.setRotationPoint(-5.0F, 1.6F, 6.0F);
        this.Bodysegment3.addChild(AnalfinR);
        this.AnalfinR.cubeList.add(new ModelBox(AnalfinR, 0, 86, -8.0F, 0.0F, -4.0F, 8, 0, 10, 0.0F, false));

        this.AnalfinL = new AdvancedModelRenderer(this);
        this.AnalfinL.setRotationPoint(5.0F, 1.6F, 6.0F);
        this.Bodysegment3.addChild(AnalfinL);
        this.AnalfinL.cubeList.add(new ModelBox(AnalfinL, 74, 25, 0.0F, 0.0F, -4.0F, 8, 0, 10, 0.0F, false));

        this.Bodysegment4 = new AdvancedModelRenderer(this);
        this.Bodysegment4.setRotationPoint(0.0F, -1.0F, 10.8F);
        this.Bodysegment3.addChild(Bodysegment4);
        this.setRotateAngle(Bodysegment4, 0.1309F, 0.0F, 0.0F);
        this.Bodysegment4.cubeList.add(new ModelBox(Bodysegment4, 37, 84, -4.0F, -4.0F, 0.0F, 8, 6, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.Bodysegment4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -13.0F, -3.2F, 0, 14, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Bodysegment4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2793F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 96, -2.5F, -2.0F, -0.3F, 5, 2, 8, 0.0F, false));

        this.Bodysegment5 = new AdvancedModelRenderer(this);
        this.Bodysegment5.setRotationPoint(0.0F, 0.0F, 7.2F);
        this.Bodysegment4.addChild(Bodysegment5);
        this.setRotateAngle(Bodysegment5, 0.1309F, 0.0F, 0.0F);
        this.Bodysegment5.cubeList.add(new ModelBox(Bodysegment5, 95, 88, -3.0F, -2.0F, 0.0F, 6, 4, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -2.8F, -0.2F);
        this.Bodysegment5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 97, -3.0F, -0.9F, 0.2F, 4, 2, 8, 0.0F, false));

        this.Bodysegment6 = new AdvancedModelRenderer(this);
        this.Bodysegment6.setRotationPoint(0.0F, 0.0F, 7.2F);
        this.Bodysegment5.addChild(Bodysegment6);
        this.setRotateAngle(Bodysegment6, 0.2182F, 0.0F, 0.0F);
        this.Bodysegment6.cubeList.add(new ModelBox(Bodysegment6, 97, 0, -2.0F, -2.0F, -0.4F, 4, 4, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodysegment6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 97, 0.0F, -2.0F, 0.0F, 0, 12, 8, 0.0F, false));

        this.Bodysegment7 = new AdvancedModelRenderer(this);
        this.Bodysegment7.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Bodysegment6.addChild(Bodysegment7);
        this.setRotateAngle(Bodysegment7, 0.0436F, 0.0F, 0.0F);


        this.Bodysegment8 = new AdvancedModelRenderer(this);
        this.Bodysegment8.setRotationPoint(0.0F, 0.0F, 9.2F);
        this.Bodysegment7.addChild(Bodysegment8);
        this.setRotateAngle(Bodysegment8, -0.0436F, 0.0F, 0.0F);
        this.Bodysegment8.cubeList.add(new ModelBox(Bodysegment8, 0, 0, 0.0F, -1.6F, -9.2F, 0, 10, 26, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, -8.6F);
        this.Bodysegment8.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 4, -2.0F, -1.0F, -0.8F, 2, 2, 18, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Antineosteus.render(f5);
    }

    public void renderStaticWall(float f) {
        //this.Cephalon.offsetY = -0.25F;
        //this.Cephalon.offsetX = -0.15F;
        //this.Cephalon.offsetZ = 0.025F;
        this.Jaw.rotateAngleX = (float) Math.toRadians(26);
        this.Cephalon.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Antineosteus.rotateAngleY = (float) Math.toRadians(90);
        this.Bodysegment1.rotateAngleX = (float) Math.toRadians(-10);
        this.Bodysegment2.rotateAngleX = (float) Math.toRadians(7.5);
        this.Bodysegment3.rotateAngleX = (float) Math.toRadians(2.5);
        this.Bodysegment4.rotateAngleX = (float) Math.toRadians(15);
        this.Bodysegment5.rotateAngleX = (float) Math.toRadians(15);
        this.Bodysegment6.rotateAngleX = (float) Math.toRadians(15);
        this.Cephalon.rotateAngleX = (float) Math.toRadians(-10);
        this.Jaw.rotateAngleX = (float) Math.toRadians(46);
        this.PectoralfinL.rotateAngleZ = (float) Math.toRadians(+40);
        this.PectoralfinR.rotateAngleZ = (float) Math.toRadians(-40);
        this.AnalfinL.rotateAngleZ = (float) Math.toRadians(+37.5);
        this.AnalfinR.rotateAngleZ = (float) Math.toRadians(-37.5);
        this.Antineosteus.offsetY = -0.25F;
        this.Antineosteus.offsetX = -0.15F;
        this.Antineosteus.offsetZ = 0.025F;
        this.Antineosteus.render(0.01F);
        this.resetToDefaultPose();
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
        //this.Antineosteus.offsetZ = -0.4F;
        //this.Antineosteus.offsetY = 0.2F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodysegment2, this.Bodysegment3, this.Bodysegment4, this.Bodysegment5, this.Bodysegment6};
        EntityPrehistoricFloraAntineosteus antineosteus = (EntityPrehistoricFloraAntineosteus) e;
        float speed = 0.3F;
        float taildegree = 0.25F;
        float inwater = 1F;

        if (!e.isInWater()) {
            speed = 0.7F;
            inwater = 0.65F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifier = 1F;
        float swingModifier = 1F;
        if (isAtBottom && !antineosteus.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
            bottomModifier = 0.5F;
            swingModifier = 0.5F;
            //this.bodylower.rotateAngleX = (float) Math.toRadians(-10);
            //this.Antineosteus.rotateAngleX = (float) Math.toRadians(10);
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * bottomModifier, 0.02F, -1, f2, 1);
            this.chainSwing(fishTail, speed * bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(Antineosteus, speed * bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);

            this.flap(PectoralfinL, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.2F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(PectoralfinL, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(PectoralfinR, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.2F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(PectoralfinR, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            this.flap(AnalfinL, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(AnalfinL, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(AnalfinR, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(AnalfinR, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.Antineosteus.offsetY = 0.2F;
                this.bob(Antineosteus, -speed, 1F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -1, f2, 1);
                this.chainSwing(fishTail, speed, 0.10F, -3, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.Cephalon, (float) Math.toRadians(-12.5) ,0,0);
        animator.rotate(this.Jaw, (float) Math.toRadians(30), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(1);

    }
}
