package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelBelantsea extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyend;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfin;
    private final AdvancedModelRenderer Seconddorsalfinend;
    private final AdvancedModelRenderer Tailunderside;
    private final AdvancedModelRenderer Analfinleft;
    private final AdvancedModelRenderer Analfinright;
    private final AdvancedModelRenderer Seconddorsalfinstart;
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
    private final AdvancedModelRenderer Dorsalfinflesh;

    public ModelBelantsea() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 15.0F, 2.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 78, -2.0F, -3.0F, -7.0F, 4, 12, 10, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.6F, 2.0F);
        this.Bodyfront.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0213F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 63, -1.5F, -2.0F, 0.0F, 3, 10, 4, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, -0.4F, 3.0F);
        this.Bodymiddle.addChild(Bodyend);
        this.setRotateAngle(Bodyend, 0.0213F, 0.0F, 0.0F);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 0, 49, -1.0F, -1.5F, 0.0F, 2, 9, 4, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(-0.01F, 0.5F, 3.0F);
        this.Bodyend.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 38, -1.0F, -1.5F, 0.0F, 2, 5, 5, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.6F, 4.5F);
        this.Tailbase.addChild(Tailend);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 30, -0.5F, -1.0F, 0.0F, 1, 3, 4, 0.0F, false));

        this.Tailfin = new AdvancedModelRenderer(this);
        this.Tailfin.setRotationPoint(0.01F, 0.5F, 1.5F);
        this.Tailend.addChild(Tailfin);
        this.Tailfin.cubeList.add(new ModelBox(Tailfin, 28, 21, 0.0F, -3.5F, 0.0F, 0, 7, 6, 0.0F, false));

        this.Seconddorsalfinend = new AdvancedModelRenderer(this);
        this.Seconddorsalfinend.setRotationPoint(-0.01F, -1.0F, 0.0F);
        this.Tailbase.addChild(Seconddorsalfinend);
        this.Seconddorsalfinend.cubeList.add(new ModelBox(Seconddorsalfinend, 27, 0, 0.0F, -7.0F, 0.0F, 0, 8, 7, 0.0F, false));

        this.Tailunderside = new AdvancedModelRenderer(this);
        this.Tailunderside.setRotationPoint(0.0F, 6.5F, 1.0F);
        this.Tailbase.addChild(Tailunderside);
        this.setRotateAngle(Tailunderside, 0.658F, 0.0F, 0.0F);
        this.Tailunderside.cubeList.add(new ModelBox(Tailunderside, 10, 33, -0.49F, -3.0F, 0.0F, 1, 3, 5, 0.0F, false));

        this.Analfinleft = new AdvancedModelRenderer(this);
        this.Analfinleft.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.Tailunderside.addChild(Analfinleft);
        this.setRotateAngle(Analfinleft, 0.0F, 0.0F, -0.6981F);
        this.Analfinleft.cubeList.add(new ModelBox(Analfinleft, 19, 14, 0.01F, 0.0F, -3.5F, 0, 5, 7, 0.0F, false));

        this.Analfinright = new AdvancedModelRenderer(this);
        this.Analfinright.setRotationPoint(-0.48F, 0.0F, 2.0F);
        this.Tailunderside.addChild(Analfinright);
        this.setRotateAngle(Analfinright, 0.0F, 0.0F, 0.6981F);
        this.Analfinright.cubeList.add(new ModelBox(Analfinright, 19, 14, -0.01F, 0.0F, -3.5F, 0, 5, 7, 0.0F, true));

        this.Seconddorsalfinstart = new AdvancedModelRenderer(this);
        this.Seconddorsalfinstart.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.Bodyend.addChild(Seconddorsalfinstart);
        this.Seconddorsalfinstart.cubeList.add(new ModelBox(Seconddorsalfinstart, 20, 3, 0.0F, -6.0F, 0.0F, 0, 6, 3, 0.0F, false));

        this.Bellyend = new AdvancedModelRenderer(this);
        this.Bellyend.setRotationPoint(0.0F, 8.4F, 0.0F);
        this.Bodyend.addChild(Bellyend);
        this.setRotateAngle(Bellyend, 0.2335F, 0.0F, 0.0F);
        this.Bellyend.cubeList.add(new ModelBox(Bellyend, 11, 59, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Firstdorsalfin = new AdvancedModelRenderer(this);
        this.Firstdorsalfin.setRotationPoint(0.0F, -2.3F, -1.5F);
        this.Bodyfront.addChild(Firstdorsalfin);
        this.Firstdorsalfin.cubeList.add(new ModelBox(Firstdorsalfin, 0, 0, 0.0F, -6.5F, -6.5F, 0, 7, 13, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(-1.9F, 8.0F, -2.0F);
        this.Bodyfront.addChild(Leftpelvicfin);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, -0.4458F);
        this.Leftpelvicfin.cubeList.add(new ModelBox(Leftpelvicfin, 10, 52, -7.0F, 0.0F, -6.0F, 7, 0, 12, 0.0F, false));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(1.9F, 8.0F, -2.0F);
        this.Bodyfront.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, 0.4458F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 3, 65, 0.0F, 0.0F, -6.0F, 7, 0, 12, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.1F);
        this.Bodyfront.addChild(Head);
        this.setRotateAngle(Head, 0.1274F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 29, 85, -2.5F, -2.0F, -6.0F, 5, 9, 6, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 7.0F, -6.0F);
        this.Head.addChild(Throat);
        this.setRotateAngle(Throat, -0.5732F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 30, 79, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -3.3F, -2.2F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.3396F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 19, 81, -1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.Face = new AdvancedModelRenderer(this);
        this.Face.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Head.addChild(Face);
        this.setRotateAngle(Face, -0.5308F, 0.0F, 0.0F);
        this.Face.cubeList.add(new ModelBox(Face, 52, 91, -1.5F, 0.0F, 0.0F, 3, 5, 4, 0.0F, false));

        this.Upperlips = new AdvancedModelRenderer(this);
        this.Upperlips.setRotationPoint(0.0F, 4.7F, -0.2F);
        this.Face.addChild(Upperlips);
        this.setRotateAngle(Upperlips, 0.2335F, 0.0F, 0.0F);
        this.Upperlips.cubeList.add(new ModelBox(Upperlips, 46, 78, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.Upperteeth = new AdvancedModelRenderer(this);
        this.Upperteeth.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.Upperlips.addChild(Upperteeth);
        this.setRotateAngle(Upperteeth, 0.1911F, 0.0F, 0.0F);
        this.Upperteeth.cubeList.add(new ModelBox(Upperteeth, 59, 76, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 4.1F, -4.95F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.2972F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 46, 84, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.Lowerteeth = new AdvancedModelRenderer(this);
        this.Lowerteeth.setRotationPoint(-0.01F, 0.0F, -3.8F);
        this.Lowerjaw.addChild(Lowerteeth);
        this.setRotateAngle(Lowerteeth, -0.1698F, 0.0F, 0.0F);
        this.Lowerteeth.cubeList.add(new ModelBox(Lowerteeth, 60, 81, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Dorsalfinflesh = new AdvancedModelRenderer(this);
        this.Dorsalfinflesh.setRotationPoint(0.0F, -2.0F, -5.2F);
        this.Bodyfront.addChild(Dorsalfinflesh);
        this.setRotateAngle(Dorsalfinflesh, 0.1274F, 0.0F, 0.0F);
        this.Dorsalfinflesh.cubeList.add(new ModelBox(Dorsalfinflesh, 7, 21, -0.5F, -2.0F, -1.0F, 1, 2, 9, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(Lowerjaw, 0.7F, 0.0F, 0.0F);
        this.Bodyfront.offsetY = -0.03F;
        this.Bodyfront.offsetX = -0.02F;
        this.Bodyfront.offsetZ = -0.25F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Bodyend, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(Tailbase, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Tailend, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.4F, 0.0F, 0.0F);
        this.Bodyfront.offsetZ = -0.0F;
        this.Bodyfront.offsetY = -0.03F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Bodyfront.offsetY = -0.3F;
        this.Bodyfront.offsetX = 0.4F;
        this.Bodyfront.offsetZ = 0.0F;
        this.Bodyfront.rotateAngleY = (float)Math.toRadians(120);
        this.Bodyfront.rotateAngleX = (float)Math.toRadians(1);
        this.Bodyfront.rotateAngleZ = (float)Math.toRadians(0);
        this.Bodyfront.scaleChildren = true;
        float scaler = 2.0F;
        this.Bodyfront.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Bodyfront, 0.2F, 3.8F, -0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Bodyend, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(Tailbase, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Tailend, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.4F, 0.0F, 0.0F);
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
        this.Bodyfront.offsetY = 0.8F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodymiddle, this.Bodyend, this.Tailbase, this.Tailend};

        float speed = 0.485F;
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
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3.25, f2, 1);
            this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(Leftpelvicfin, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 1F;
                this.bob(Bodyfront, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
