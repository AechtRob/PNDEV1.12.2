package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelMegactenopetalus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyend;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfin;
    private final AdvancedModelRenderer Seconddorsalfin;
    private final AdvancedModelRenderer Tailunderside;
    private final AdvancedModelRenderer Analfinleft;
    private final AdvancedModelRenderer Analfinright;
    private final AdvancedModelRenderer Seconddorsalfinflesh;
    private final AdvancedModelRenderer Bellyend;
    private final AdvancedModelRenderer Firstdorsalfin;
    private final AdvancedModelRenderer Leftpelvicfin;
    private final AdvancedModelRenderer Rightpelvicfin;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Face;
    private final AdvancedModelRenderer Upperlips;
    private final AdvancedModelRenderer Upperteeth;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerteeth;
    private final AdvancedModelRenderer Lowertoothpoint;
    private final AdvancedModelRenderer Firstdorsalfinflesh;
    private ModelAnimator animator;

    public ModelMegactenopetalus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 14.0F, 2.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.root.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 74, -2.5F, -3.0F, -7.0F, 5, 13, 10, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.7F, 2.0F);
        this.Bodyfront.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0848F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 57, -2.0F, -2.5F, 0.0F, 4, 11, 4, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, -0.9F, 3.2F);
        this.Bodymiddle.addChild(Bodyend);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 0, 41, -1.5F, -1.5F, 0.0F, 3, 10, 4, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(-0.01F, 0.5F, 2.9F);
        this.Bodyend.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.0424F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 9, 27, -1.5F, -1.5F, 0.0F, 3, 5, 8, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.7F, 7.3F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0848F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 0, 21, -1.0F, -2.0F, 0.0F, 2, 4, 5, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.5F, 3.9F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.5943F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 43, 16, -0.4F, -1.0F, 0.0F, 1, 2, 7, 0.0F, false));

        this.Tailfin = new AdvancedModelRenderer(this);
        this.Tailfin.setRotationPoint(0.01F, -1.0F, 1.5F);
        this.Tailend.addChild(Tailfin);
        this.setRotateAngle(Tailfin, 0.0848F, 0.0F, 0.0F);
        this.Tailfin.cubeList.add(new ModelBox(Tailfin, 0, 0, 0.0F, 0.0F, -2.5F, 0, 7, 11, 0.0F, false));

        this.Seconddorsalfin = new AdvancedModelRenderer(this);
        this.Seconddorsalfin.setRotationPoint(-0.01F, -2.2F, -1.0F);
        this.Tailbase.addChild(Seconddorsalfin);
        this.setRotateAngle(Seconddorsalfin, 0.0213F, 0.0F, 0.0F);
        this.Seconddorsalfin.cubeList.add(new ModelBox(Seconddorsalfin, 27, 0, 0.0F, -6.0F, 0.0F, 0, 7, 10, 0.0F, false));

        this.Tailunderside = new AdvancedModelRenderer(this);
        this.Tailunderside.setRotationPoint(0.0F, 8.0F, 0.3F);
        this.Tailbase.addChild(Tailunderside);
        this.setRotateAngle(Tailunderside, 0.5447F, 0.0F, 0.0F);
        this.Tailunderside.cubeList.add(new ModelBox(Tailunderside, 24, 32, -1.0F, -4.0F, 0.0F, 2, 4, 9, 0.0F, false));

        this.Analfinleft = new AdvancedModelRenderer(this);
        this.Analfinleft.setRotationPoint(1.0F, -0.2F, 5.5F);
        this.Tailunderside.addChild(Analfinleft);
        this.setRotateAngle(Analfinleft, 0.0F, 0.0F, -0.6981F);
        this.Analfinleft.cubeList.add(new ModelBox(Analfinleft, 49, 0, 0.01F, 0.0F, -4.0F, 0, 6, 9, 0.0F, false));

        this.Analfinright = new AdvancedModelRenderer(this);
        this.Analfinright.setRotationPoint(-0.98F, -0.2F, 5.5F);
        this.Tailunderside.addChild(Analfinright);
        this.setRotateAngle(Analfinright, 0.0F, 0.0F, 0.6981F);
        this.Analfinright.cubeList.add(new ModelBox(Analfinright, 49, 0, -0.01F, 0.0F, -4.0F, 0, 6, 9, 0.0F, true));

        this.Seconddorsalfinflesh = new AdvancedModelRenderer(this);
        this.Seconddorsalfinflesh.setRotationPoint(0.0F, -0.4F, 0.8F);
        this.Tailbase.addChild(Seconddorsalfinflesh);
        this.setRotateAngle(Seconddorsalfinflesh, 0.1698F, 0.0F, 0.0F);
        this.Seconddorsalfinflesh.cubeList.add(new ModelBox(Seconddorsalfinflesh, 1, 0, -0.5F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.Bellyend = new AdvancedModelRenderer(this);
        this.Bellyend.setRotationPoint(0.0F, 9.4F, 0.0F);
        this.Bodyend.addChild(Bellyend);
        this.setRotateAngle(Bellyend, 0.2335F, 0.0F, 0.0F);
        this.Bellyend.cubeList.add(new ModelBox(Bellyend, 15, 47, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Firstdorsalfin = new AdvancedModelRenderer(this);
        this.Firstdorsalfin.setRotationPoint(0.0F, -2.8F, -0.5F);
        this.Bodyfront.addChild(Firstdorsalfin);
        this.Firstdorsalfin.cubeList.add(new ModelBox(Firstdorsalfin, 47, 12, 0.0F, -7.0F, -7.5F, 0, 8, 14, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(-2.4F, 8.5F, -2.5F);
        this.Bodyfront.addChild(Leftpelvicfin);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, -0.4458F);
        this.Leftpelvicfin.cubeList.add(new ModelBox(Leftpelvicfin, 15, 46, -8.0F, 0.0F, -6.5F, 8, 0, 13, 0.0F, false));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(2.4F, 8.5F, -2.5F);
        this.Bodyfront.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, 0.4458F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 4, 60, 0.0F, 0.0F, -6.5F, 8, 0, 13, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.0F, -4.1F);
        this.Bodyfront.addChild(Head);
        this.setRotateAngle(Head, -0.0424F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 32, 75, -3.0F, -2.0F, -6.0F, 6, 9, 6, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.01F, 7.0F, -6.0F);
        this.Head.addChild(Throat);
        this.setRotateAngle(Throat, -0.517F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 34, 67, -2.5F, -2.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(-0.01F, -3.9F, -2.8F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.5732F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 21, 74, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.Face = new AdvancedModelRenderer(this);
        this.Face.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Head.addChild(Face);
        this.setRotateAngle(Face, -0.5519F, 0.0F, 0.0F);
        this.Face.cubeList.add(new ModelBox(Face, 57, 74, -2.0F, 0.0F, 0.0F, 4, 6, 5, 0.0F, false));

        this.Upperlips = new AdvancedModelRenderer(this);
        this.Upperlips.setRotationPoint(0.0F, 5.5F, -0.2F);
        this.Face.addChild(Upperlips);
        this.setRotateAngle(Upperlips, 0.1698F, 0.0F, 0.0F);
        this.Upperlips.cubeList.add(new ModelBox(Upperlips, 34, 60, -2.5F, 0.0F, 0.0F, 5, 1, 5, 0.01F, false));

        this.Upperteeth = new AdvancedModelRenderer(this);
        this.Upperteeth.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.Upperlips.addChild(Upperteeth);
        this.setRotateAngle(Upperteeth, 0.1911F, 0.0F, 0.0F);
        this.Upperteeth.cubeList.add(new ModelBox(Upperteeth, 45, 53, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 5.2F, -5.21F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.4033F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 53, 65, -2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Lowerteeth = new AdvancedModelRenderer(this);
        this.Lowerteeth.setRotationPoint(-0.01F, 0.1F, -4.3F);
        this.Lowerjaw.addChild(Lowerteeth);
        this.setRotateAngle(Lowerteeth, -0.1698F, 0.0F, 0.0F);
        this.Lowerteeth.cubeList.add(new ModelBox(Lowerteeth, 50, 59, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.Lowertoothpoint = new AdvancedModelRenderer(this);
        this.Lowertoothpoint.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Lowerteeth.addChild(Lowertoothpoint);
        this.Lowertoothpoint.cubeList.add(new ModelBox(Lowertoothpoint, 0, 0, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.Firstdorsalfinflesh = new AdvancedModelRenderer(this);
        this.Firstdorsalfinflesh.setRotationPoint(0.0F, -1.9F, -5.1F);
        this.Bodyfront.addChild(Firstdorsalfinflesh);
        this.setRotateAngle(Firstdorsalfinflesh, 0.1274F, 0.0F, 0.0F);
        this.Firstdorsalfinflesh.cubeList.add(new ModelBox(Firstdorsalfinflesh, 24, 18, -1.0F, -2.0F, -1.0F, 2, 2, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Bodyfront.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(Lowerjaw, 0.3F, 0.0F, 0.0F);
        this.Bodyfront.offsetY = -0.04F;
        this.Bodyfront.offsetX = -0.05F;
        this.Bodyfront.offsetZ = -0.07F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront, -0.2F, 0.0F, 0.1F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Bodyend, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Tailbase, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(Tailend, 0.4F, 0.4F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.3F, 0.0F, 0.0F);
        this.Bodyfront.offsetZ = -0.0F;
        this.Bodyfront.offsetY = -0.12F;
        this.Bodyfront.offsetX = 0.01F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Bodyend, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Tailend, 0.4F, -0.4F, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.4F, 0.0F, 0.0F);
        this.Bodyfront.offsetZ = -0.0F;
        this.Bodyfront.offsetY = 0.03F;
        this.Bodyfront.offsetX = -0.0F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Bodyfront.offsetY = -2.0F;
        this.Bodyfront.offsetX = -1.338F;
        this.Bodyfront.rotateAngleY = (float)Math.toRadians(200);
        this.Bodyfront.rotateAngleX = (float)Math.toRadians(8);
        this.Bodyfront.rotateAngleZ = (float)Math.toRadians(-8);
        this.Bodyfront.scaleChildren = true;
        float scaler = 1.63F;
        this.Bodyfront.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyend, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Bodyfront.render(f);
        //Reset rotations, positions and sizing:
        this.Bodyfront.setScale(1.0F, 1.0F, 1.0F);
        this.Bodyfront.scaleChildren = false;
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
        this.resetToDefaultPose();
        this.Bodyfront.offsetY = 1F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodymiddle, this.Bodyend, this.Tailbase, this.Tailmiddle, this.Tailend};

        float speed = 0.445F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.185F;
            taildegree = 0.25F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3.25, f2, 1);
            this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.3F, false, 0, 0.22F, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1.2F;
                this.bob(Bodyfront, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed*0.5F, 0.1F, -3, f2, 1);
            }
        }

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.5F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
