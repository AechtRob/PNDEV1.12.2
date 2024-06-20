package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelBelantsea extends ModelBasePalaeopedia {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Firstdorsalfin;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Dorsalfinflesh;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Seconddorsalfinstart;
    public AdvancedModelRenderer Bellyend;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Seconddorsalfinend;
    public AdvancedModelRenderer Tailunderside;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Throat;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Face;
    public AdvancedModelRenderer Lowerjaw;
    public AdvancedModelRenderer Upperlips;
    public AdvancedModelRenderer Upperteeth;
    public AdvancedModelRenderer Lowerteeth;

    public ModelBelantsea() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Throat = new AdvancedModelRenderer(this, 30, 79);
        this.Throat.setRotationPoint(0.0F, 7.0F, -6.0F);
        this.Throat.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Throat, -0.5731661290180989F, 0.0F, 0.0F);
        this.Bodyend = new AdvancedModelRenderer(this, 0, 49);
        this.Bodyend.setRotationPoint(0.0F, -0.4000000059604645F, 3.0F);
        this.Bodyend.addBox(-1.0F, -1.5F, 0.0F, 2, 9, 4, 0.0F);
        this.setRotateAngle(Bodyend, 0.021293017373673524F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 0, 38);
        this.Tailbase.setRotationPoint(0.009999999776482582F, 0.5F, 3.0F);
        this.Tailbase.addBox(-1.0F, -1.5F, 0.0F, 2, 5, 5, 0.0F);
        this.Seconddorsalfinend = new AdvancedModelRenderer(this, 27, 0);
        this.Seconddorsalfinend.setRotationPoint(0.009999999776482582F, -1.0F, 0.0F);
        this.Seconddorsalfinend.addBox(0.0F, -7.0F, 0.0F, 0, 8, 7, 0.0F);
        this.Upperlips = new AdvancedModelRenderer(this, 46, 78);
        this.Upperlips.setRotationPoint(0.0F, 4.699999809265137F, -0.20000000298023224F);
        this.Upperlips.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Upperlips, 0.23352505591421208F, 0.0F, 0.0F);
        this.Analfin = new AdvancedModelRenderer(this, 19, 14);
        this.Analfin.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Analfin.addBox(0.0F, 0.0F, -3.5F, 0, 5, 7, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 28, 21);
        this.Tailfin.setRotationPoint(-0.009999999776482582F, 0.5F, 1.5F);
        this.Tailfin.addBox(0.0F, -3.5F, 0.0F, 0, 7, 6, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 3, 65);
        this.Leftpelvicfin.setRotationPoint(1.899999976158142F, 8.0F, -2.0F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, -6.0F, 7, 0, 12, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, 0.4457571069383183F);
        this.Face = new AdvancedModelRenderer(this, 52, 91);
        this.Face.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Face.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(Face, -0.5307546228683145F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 19, 81);
        this.Headslope.setRotationPoint(0.0F, -3.299999952316284F, -2.200000047683716F);
        this.Headslope.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Headslope, 0.33964105645913F, 0.0F, 0.0F);
        this.Tailunderside = new AdvancedModelRenderer(this, 10, 33);
        this.Tailunderside.setRotationPoint(0.0F, 6.5F, 1.0F);
        this.Tailunderside.addBox(-0.5F, -3.0F, 0.0F, 1, 3, 5, 0.0F);
        this.setRotateAngle(Tailunderside, 0.6579891413176677F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 78);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyfront.addBox(-2.0F, -3.0F, -7.0F, 4, 12, 10, 0.0F);
        this.Upperteeth = new AdvancedModelRenderer(this, 59, 76);
        this.Upperteeth.setRotationPoint(0.0F, 1.0F, 0.20000000298023224F);
        this.Upperteeth.addBox(-1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Upperteeth, 0.1911135497644277F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 10, 52);
        this.Rightpelvicfin.setRotationPoint(-1.899999976158142F, 8.0F, -2.0F);
        this.Rightpelvicfin.addBox(-7.0F, 0.0F, -6.0F, 7, 0, 12, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, -0.4457571069383183F);
        this.Dorsalfinflesh = new AdvancedModelRenderer(this, 7, 21);
        this.Dorsalfinflesh.setRotationPoint(0.0F, -2.0F, -5.199999809265137F);
        this.Dorsalfinflesh.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 9, 0.0F);
        this.setRotateAngle(Dorsalfinflesh, 0.12740903872453743F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 63);
        this.Bodymiddle.setRotationPoint(0.0F, 0.6000000238418579F, 2.0F);
        this.Bodymiddle.addBox(-1.5F, -2.0F, 0.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(Bodymiddle, -0.021293017373673524F, 0.0F, 0.0F);
        this.Firstdorsalfin = new AdvancedModelRenderer(this, 0, 0);
        this.Firstdorsalfin.setRotationPoint(0.0F, -2.299999952316284F, -1.5F);
        this.Firstdorsalfin.addBox(0.0F, -6.5F, -6.5F, 0, 7, 13, 0.0F);
        this.Seconddorsalfinstart = new AdvancedModelRenderer(this, 20, 3);
        this.Seconddorsalfinstart.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.Seconddorsalfinstart.addBox(0.0F, -6.0F, 0.0F, 0, 6, 3, 0.0F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 30);
        this.Tailend.setRotationPoint(0.0F, 0.6000000238418579F, 4.5F);
        this.Tailend.addBox(-0.5F, -1.0F, 0.0F, 1, 3, 4, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 29, 85);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.099999904632568F);
        this.Head.addBox(-2.5F, -2.0F, -6.0F, 5, 9, 6, 0.0F);
        this.setRotateAngle(Head, 0.12740903872453743F, 0.0F, 0.0F);
        this.Bellyend = new AdvancedModelRenderer(this, 11, 59);
        this.Bellyend.setRotationPoint(0.0F, 8.399999618530273F, 0.0F);
        this.Bellyend.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Bellyend, 0.23352505591421208F, 0.0F, 0.0F);
        this.Lowerjaw = new AdvancedModelRenderer(this, 46, 84);
        this.Lowerjaw.setRotationPoint(0.0F, 4.099999904632568F, -4.949999809265137F);
        this.Lowerjaw.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F);
        //this.setRotateAngle(Lowerjaw, -0.2972295835988592F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, -0.1F, 0.0F, 0.0F);
        this.Lowerteeth = new AdvancedModelRenderer(this, 60, 81);
        this.Lowerteeth.setRotationPoint(0.009999999776482582F, 0.0F, -3.799999952316284F);
        this.Lowerteeth.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Lowerteeth, -0.169820528229565F, 0.0F, 0.0F);
        this.Head.addChild(this.Throat);
        this.Bodymiddle.addChild(this.Bodyend);
        this.Bodyend.addChild(this.Tailbase);
        this.Tailbase.addChild(this.Seconddorsalfinend);
        this.Face.addChild(this.Upperlips);
        this.Tailunderside.addChild(this.Analfin);
        this.Tailend.addChild(this.Tailfin);
        this.Bodyfront.addChild(this.Leftpelvicfin);
        this.Head.addChild(this.Face);
        this.Head.addChild(this.Headslope);
        this.Tailbase.addChild(this.Tailunderside);
        this.Upperlips.addChild(this.Upperteeth);
        this.Bodyfront.addChild(this.Rightpelvicfin);
        this.Bodyfront.addChild(this.Dorsalfinflesh);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Bodyfront.addChild(this.Firstdorsalfin);
        this.Bodyend.addChild(this.Seconddorsalfinstart);
        this.Tailbase.addChild(this.Tailend);
        this.Bodyfront.addChild(this.Head);
        this.Bodyend.addChild(this.Bellyend);
        this.Head.addChild(this.Lowerjaw);
        this.Lowerjaw.addChild(this.Lowerteeth);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodyfront.offsetY = -0.05F;
        this.Bodyfront.offsetZ = -0.01F;
        this.Bodyfront.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2F, 0.1F);
        this.setRotateAngle(Bodyend, 0.0F, 0.2F, 0.1F);
        this.setRotateAngle(Tailbase, 0.0F, 0.25F, 0.1F);
        this.setRotateAngle(Tailend, 0.0F, -0.3F, 0.1F);
        this.Bodyfront.offsetY = 0.12F;
        this.Bodyfront.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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
